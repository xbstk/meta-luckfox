# Copyright (c) 2025 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

require conf/machine/include/arm/armv8-2a/tune-cortexa55.inc
require conf/machine/include/rockchip.inc

MACHINEOVERRIDES:prepend = "rk3566:"

UBOOT_ENTRYPOINT = "0x06000000"
UBOOT_SUFFIX = "itb"
