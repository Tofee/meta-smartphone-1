#!/bin/sh

if [ `uname -a | grep 2.6.35` ] ; then
    # for 2.6.35 based kernels
    echo 1 > /sys/class/usb_composite/rndis/enable
    # power up interface
    ifup -f usb0
else
    # for 3.0.x based kernels
    echo 0 > /sys/class/android_usb/android0/enable
    echo 1 > /sys/class/android_usb/android0/f_rndis/wceis
    echo 18d1 > /sys/class/android_usb/android0/idVendor
    echo 4e23 > /sys/class/android_usb/android0/idProduct
    echo rndis > /sys/class/android_usb/android0/functions
    echo 224 > /sys/class/android_usb/android0/bDeviceClass
    echo 1 > /sys/class/android_usb/android0/enable
    # power up interface
    ifup -f rndis0
fi
