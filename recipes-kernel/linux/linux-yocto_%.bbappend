# Copyright (c) 2025 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:aarch64 = " \
file://remove-non-rockchip-aarch64.cfg \
file://remove-non-rockchip-aarch64.scc \
"

KERNEL_FEATURES:append:aarch64 = " remove-non-rockchip-aarch64.scc"

COMPATIBLE_MACHINE = "rockchip"
