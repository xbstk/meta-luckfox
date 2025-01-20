# Copyright (c) 2025 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
file://rk3566_ddr_1056MHz_v1.23.bin \
file://rk3568_bl31_v1.44.elf \
file://boot.cmd \
"

UBOOT_ENV_SUFFIX = "scr"
UBOOT_ENV = "boot"

export ROCKCHIP_TPL = "${UNPACKDIR}/rk3566_ddr_1056MHz_v1.23.bin"
export BL31 = "${UNPACKDIR}/rk3568_bl31_v1.44.elf"

COMPATIBLE_MACHINE = "rockchip"
