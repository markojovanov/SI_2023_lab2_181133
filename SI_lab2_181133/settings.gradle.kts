rootProject.name = "SI_lab2_181133"
include("src:main:test")
findProject(":src:main:test")?.name = "test"
