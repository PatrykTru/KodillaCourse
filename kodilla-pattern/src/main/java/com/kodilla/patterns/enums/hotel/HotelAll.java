package com.kodilla.patterns.enums.hotel;

public class HotelAll {

    public static void main(String[] args) {
        System.out.println("Accommodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season:" + Seasons.LOW.getSingleRoomPrice());
        System.out.println("   - high season:" + Seasons.HIGH.getSingleRoomPrice());
        System.out.println("   - holiday season:" + Seasons.HOLIDAY.getSingleRoomPrice());
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season:" + Seasons.LOW.getDoubleRoomPrice());
        System.out.println("   - high season:" + Seasons.HIGH.getDoubleRoomPrice());
        System.out.println("   - holiday season:" + Seasons.HOLIDAY.getDoubleRoomPrice());

        Seasons season = Seasons.HOLIDAY;

        System.out.println(season);
    }
}