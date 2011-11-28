FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_shr = "file://elsa.conf"

PRINC = "2"

# replace default elsa.conf with autologin version
do_install_append_shr() {
        cp -a ${WORKDIR}/elsa.conf ${D}/${sysconfdir}/elsa.conf
}