require recipes-core/android-system-image/android-system-image.inc

COMPATIBLE_MACHINE = "^rosy$"

PV = "20210219-1"

SRC_URI = "http://build.webos-ports.org/halium-luneos-9.0/halium-luneos-9.0-${PV}-${MACHINE}.tar.bz2"
SRC_URI[md5sum] = "167d8b87f076623b55fe7e81cd90c3c9"
SRC_URI[sha256sum] = "6490047a5ebc33f1328b1af63bb530a8be4bdfe919be278f3fa8a5049a6f7b50"

# For Android 9+, it's highly recommended to use a rootfs system image
ANDROID_SYSTEM_IMAGE_DESTNAME = "android-rootfs.img"

