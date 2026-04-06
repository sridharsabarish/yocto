FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

do_apply_protective_charm:append() {
    bbnote "Adding a protective charm, taught by Professor McGonagall"
    touch "${WORKDIR}/protective_charm.txt"
}
