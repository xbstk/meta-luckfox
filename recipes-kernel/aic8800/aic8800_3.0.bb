# Copyright (c) 2025 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

DESCRIPTION = "Aicsemi AIC8800 driver"
HOMEPAGE = "https://github.com/radxa-pkg/aic8800"

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = " \
git://github.com/xbrtszstk/aic8800.git;protocol=https;branch=main \
file://0001-fix-linux-6.1-build.patch \
file://0002-fix-linux-6.5-build.patch \
file://0003-fix-linux-6.7-build.patch \
file://0004-fix-linux-6.9-build.patch \
file://0005-fix-linux-6.12-build.patch \
"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit module

do_compile:prepend() {
  cd ${S}/src/SDIO/driver_fw/driver/aic8800
}

do_install:prepend() {
  cd ${S}/src/SDIO/driver_fw/driver/aic8800
}

do_install:append() {
  cd ${S}/src/SDIO/driver_fw/fw/aic8800D80

  install -d ${D}${nonarch_base_libdir}/firmware
  install -m 0644 ./aic_userconfig_8800d80.txt ${D}${nonarch_base_libdir}/firmware
  install -m 0644 ./fmacfw_8800d80_u02.bin ${D}${nonarch_base_libdir}/firmware
  install -m 0644 ./fw_adid_8800d80_u02.bin ${D}${nonarch_base_libdir}/firmware
  install -m 0644 ./fw_patch_8800d80_u02.bin ${D}${nonarch_base_libdir}/firmware
  install -m 0644 ./fw_patch_table_8800d80_u02.bin ${D}${nonarch_base_libdir}/firmware
}

RPROVIDES:${PN} = "kernel-module-aic8800"

FILES:${PN} = "${nonarch_base_libdir}/firmware"
