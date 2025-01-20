# Copyright (c) 2025 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

setenv bootargs root=PARTLABEL=rootfs rootwait

load ${devtype} ${devnum}:${distro_bootpart} ${loadaddr} fitImage
bootm ${loadaddr}
