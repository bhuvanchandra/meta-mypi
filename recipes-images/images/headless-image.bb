SUMMARY = "Headless Image"

LICENSE = "MIT"

export IMAGE_BASENAME = "Home-Automation-Image"
IMAGE_NAME_raspberrypi = "RaspberryPi_${IMAGE_BASENAME}"

IMAGE_LINGUAS = "en-us"

CONMANPKGS ?= "connman connman-plugin-loopback connman-plugin-ethernet connman-plugin-wifi connman-client"

IMAGE_INSTALL += " \
	packagegroup-core-boot \
	packagegroup-basic \
	${CORE_IMAGE_EXTRA_INSTALL} \
	udev-extra-rules \
	${CONMANPKGS} \
	mosquitto \
"

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "busybox shadow"

inherit core-image
