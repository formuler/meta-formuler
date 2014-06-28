DESCRIPTION = "Remote for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"

DEPENDS = "enigma2"

PR = "r0"

SRC_URI = " \
	file://rc-${RCTYPE}.png \
	file://rc-${RCTYPE}.xml \
	"

FILES_${PN} = "/usr/share/enigma2/rc_models/"
S = "${WORKDIR}"

do_compile() {
}

do_install() {
	install -d ${D}/usr/share/enigma2/rc_models
	install -m 0644 ${S}/rc-${RCTYPE}.png ${D}/usr/share/enigma2/rc_models/
	install -m 0644 ${S}/rc-${RCTYPE}.xml ${D}/usr/share/enigma2/rc_models/
} 