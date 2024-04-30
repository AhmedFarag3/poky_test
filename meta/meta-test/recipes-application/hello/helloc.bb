SUMMARY = "Hello world receipe"
LICENSE = "CLOSED"              
SRC_URI = "file://main.c"       
S = "${WORKDIR}"

do_compile(){
    bbwarn "the compiler is ${CC}"
    ${CC} ${LDFLAGS} main.c -o hello_c -DCONFIG_VALUE=12
}

do_install(){
    install -d ${D}/usr/bin
    cp ${WORKDIR}/hello_c ${D}/usr/bin
}