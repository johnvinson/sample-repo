def generateSampleJob = freeStyleJob("cart2")

generateSampleJob.with {
	steps {
	maven ('verifiy')
	}
}  