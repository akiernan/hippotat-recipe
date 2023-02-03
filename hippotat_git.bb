# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   debian/copyright
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPL-3.0-only & MIT & Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=aa34b57d74c32e9e92f9aa7609665690 \
                    file://GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
                    file://debian/copyright;md5=aa34b57d74c32e9e92f9aa7609665690 \
                    file://uml/rndaddtoentcnt/LICENSE;md5=e048e7a053ab211791bc99c98e723ab7"

DEPENDS += "openssl"

SRC_URI = "git://salsa.debian.org/iwj/hippotat.git;protocol=https;branch=main"

# Modify these as desired
PV = "1.1.7+git${SRCPV}"
SRCREV = "a6ac94b4922602af64f22b86ba5347ad95fcda44"

S = "${WORKDIR}/git"

inherit cargo cargo-update-recipe-crates pkgconfig

require hippotat-crates.inc
