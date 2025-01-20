# Copyright (c) 2025 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

MACHINEOVERRIDES:prepend = "rockchip:"

PACKAGE_EXCLUDE = "kernel-image-*"
MACHINE_ESSENTIAL_EXTRA_RDEPENDS = "kernel-modules"

SPL_BINARY = "idbloader.img"

PREFERRED_PROVIDER_virtual/kernel = "linux-yocto"
KCONFIG_MODE = "alldefconfig"
KBUILD_DEFCONFIG = "defconfig"
KERNEL_CLASSES = "kernel-fitimage"
KERNEL_IMAGETYPE = "fitImage"

IMAGE_FSTYPES = "ext4 wic"
IMAGE_BOOT_FILES = "boot.scr ${KERNEL_IMAGETYPE}"

WKS_FILES = "sdimage-rockchip.wks.in"
WKS_FILE_DEPENDS = "u-boot"
