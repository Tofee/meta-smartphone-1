require ${BPN}.inc

PR = "${INC_PR}.1"

EXTRA_OECONF += "--enable-vala"
SRC_URI += "file://0001-fsobasics-fix-threading-compilation-with-vala-0.16.0.patch"

SRC_URI[md5sum] = "927435e1656640ebeac63b5f140da147"
SRC_URI[sha256sum] = "d0068178d309a3464ed4b739d14c36d5ca649f4cfd83fd58f21bd8883440797c"