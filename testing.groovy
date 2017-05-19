folder("Cartridge") {
    
}
def folder = "Cartridge"
def generatejob = folder + "/cart2"

freeStyleJob(generatejob)
{

	steps {
	scm {
        git {
            remote {
                url('https://github.com/johnvinson/sample-repo.git')
                credentials('269dd22f-8bfb-4266-a53e-575dcc1446c4')
            }
        }
    }
	maven {
		mavenInstallation('MavenHOME')
		goals('package')
		
	}
	} 
	
}  