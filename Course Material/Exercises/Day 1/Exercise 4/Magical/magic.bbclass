# A bbclass for adding some magic to the build process
# This bbclass adds some Harry Potter related variables for fun

MAGIC_SCHOOL = "Hogwarts School of Witchcraft and Wizardry"
MAGIC_STUDENT = "Harry James Potter"
MAGIC_SUBJECT = "Defense Against the Dark Arts"

MAGIC_SPELL = "Expecto Patronum"
MAGIC_POTION = "Felix Felicis"
MAGIC_CREATURE = "Hippogriff"



do_print_magic_info() {
    bbdebug 2 "MAGIC_SCHOOL is ${MAGIC_SCHOOL}"
    bbdebug 2 "MAGIC_STUDENT is ${MAGIC_STUDENT}"
    bbdebug 2 "MAGIC_SUBJECT is ${MAGIC_SUBJECT}"
    bbdebug 2 "MAGIC_SPELL is ${MAGIC_SPELL}"
    bbdebug 2 "MAGIC_POTION is ${MAGIC_POTION}"
    bbdebug 2 "MAGIC_CREATURE is ${MAGIC_CREATURE}"
}

addtask print_magic_info before do_build after do_unpack
