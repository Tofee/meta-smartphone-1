require recipes-kernel/linux/linux.inc

SECTION = "kernel"

# Mark archs/machines that this kernel supports
COMPATIBLE_MACHINE = "hammerhead"

DESCRIPTION = "Kernel close to upstream with device specific patches intented to be mainlined.\
 Maintained by the PostmarketOS team."
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRC_URI = " \
  git://gitlab.com/postmarketOS/linux-postmarketos.git;branch=postmarketos-linux-qcom \
  file://0001-Fix-Hammerhead-backlight.patch \
  file://0002-Add-ramconsole.patch \
  file://defconfig \
"
S = "${WORKDIR}/git"

CMDLINE = "${ANDROID_BOOTIMG_CMDLINE}"

SRCREV = "e9fc9b4e4a83c8a9fba2230ac91d5c75b9fcd4d8"

KV = "4.17"
PV = "${KV}+gitr${SRCPV}"
# for bumping PR bump MACHINE_KERNEL_PR in the machine config
inherit machine_kernel_pr
