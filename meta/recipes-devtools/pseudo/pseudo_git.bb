require pseudo.inc

SRC_URI = "git://git.yoctoproject.org/pseudo;branch=rpurdie/include;protocol=https \
           file://fallback-passwd \
           file://fallback-group \
           "
SRC_URI:append:class-native = " \
    http://downloads.yoctoproject.org/mirror/sources/pseudo-prebuilt-2.33.tar.xz;subdir=git/prebuilt;name=prebuilt \
    file://older-glibc-symbols.patch"
SRC_URI:append:class-nativesdk = " \
    http://downloads.yoctoproject.org/mirror/sources/pseudo-prebuilt-2.33.tar.xz;subdir=git/prebuilt;name=prebuilt \
    file://older-glibc-symbols.patch"
SRC_URI[prebuilt.sha256sum] = "ed9f456856e9d86359f169f46a70ad7be4190d6040282b84c8d97b99072485aa"

SRCREV = "42fa42207546be445caa5326d2915b94c3e12d4a"
S = "${WORKDIR}/git"
PV = "1.9.0+git"

# largefile and 64bit time_t support adds these macros via compiler flags globally
# remove them for pseudo since pseudo intercepts some of the functions which will be
# aliased due to this e.g. open/open64 and it will complain about duplicate definitions
# pseudo on 32bit systems is not much of use anyway and these features are not of much
# use for it.
TARGET_CC_ARCH:remove = "-D_LARGEFILE_SOURCE -D_FILE_OFFSET_BITS=64 -D_TIME_BITS=64"

# error: use of undeclared identifier '_STAT_VER'
COMPATIBLE_HOST:libc-musl = 'null'
