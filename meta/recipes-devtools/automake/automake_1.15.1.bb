require automake.inc
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
DEPENDS_class-native = "autoconf-native"

NAMEVER = "${@oe.utils.trim_version("${PV}", 2)}"

RDEPENDS_${PN} += "\
    autoconf \
    perl \
    perl-module-bytes \
    perl-module-data-dumper \
    perl-module-strict \
    perl-module-text-parsewords \
    perl-module-thread-queue \
    perl-module-threads \
    perl-module-vars "

RDEPENDS_${PN}_class-native = "autoconf-native perl-native-runtime"

SRC_URI += " file://python-libdir.patch \
            file://py-compile-compile-only-optimized-byte-code.patch \
            file://buildtest.patch \
            "

SRC_URI[md5sum] = "95df3f2d6eb8f81e70b8cb63a93c8853"
SRC_URI[sha256sum] = "988e32527abe052307d21c8ca000aa238b914df363a617e38f4fb89f5abf6260"

CACHED_CONFIGUREVARS += "ac_cv_path_PERL=${USRBINPATH}/perl"

do_install_append () {
    install -d ${D}${datadir}
}

BBCLASSEXTEND = "native nativesdk"
