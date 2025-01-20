# Copyright (c) 2025 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

require conf/machine/include/rk3566.inc

MACHINEOVERRIDES:prepend = "radxa-zero-3:"

UBOOT_MACHINE = "radxa-zero-3-rk3566_defconfig"

SERIAL_CONSOLES = "1500000;ttyS2"
