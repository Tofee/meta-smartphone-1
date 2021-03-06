TUNE_PKGARCH_append = "-halium"
PACKAGE_EXTRA_ARCHS_append = " ${TUNE_PKGARCH}"

PREFERRED_PROVIDER_virtual/libgl ?= "mesa-gl"
PREFERRED_PROVIDER_virtual/libgbm ?= "mesa-gl"
PREFERRED_PROVIDER_virtual/egl ?= "libhybris"
PREFERRED_PROVIDER_virtual/mesa ?= "libhybris"
PREFERRED_PROVIDER_virtual/libgles1 ?= "libhybris"
PREFERRED_PROVIDER_virtual/libgles2 ?= "libhybris"

# Use Halium-based init scripts
VIRTUAL-RUNTIME_android-initramfs-scripts = "initramfs-scripts-halium"

PREFERRED_PROVIDER_virtual/android-headers = "android-headers-halium"

MACHINEOVERRIDES =. "halium:"

PNBLACKLIST[virglrenderer] ?= "Depends on mesa and mesa isn't available because mesa-gl is preferred provider of virtual/libgl"
PNBLACKLIST[cogl-1.0] ?= "Depends on libgles2 which isn't provided by libhybris"
PNBLACKLIST[clutter-1.0] ?= "Depends on blacklisted cogl-1.0"
PNBLACKLIST[mx-1.0] ?= "Depends on blacklisted clutter-1.0"
PNBLACKLIST[clutter-gtk-1.0] ?= "Depends on blacklisted clutter-1.0"
PNBLACKLIST[clutter-gst-3.0] ?= "Depends on blacklisted clutter-1.0"
