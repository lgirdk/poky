SUMMARY = "Simple Python module for working with HTML/CSS color definitions."
HOMEPAGE = "https://pypi.org/project/webcolors/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbaebec43b7d199c7fd8f5411b3b0448"

SRC_URI[sha256sum] = "08b07af286a01bcd30d583a7acadf629583d1f79bfef27dd2c2c5c263817277d"

inherit pypi python_setuptools_build_meta ptest-python-pytest

RDEPENDS:${PN}:class-target = "\
    python3-stringold \
"

BBCLASSEXTEND = "native nativesdk"
