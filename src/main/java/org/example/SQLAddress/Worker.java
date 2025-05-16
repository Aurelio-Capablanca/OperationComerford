package org.example.SQLAddress;

import org.example.SQLAddress.controller.CitiesWork;
import org.example.SQLAddress.controller.ZipCodesWork;
import org.example.SQLAddress.helper.ReadFiles;

public class Worker {
    public static void main(String[] args) {


        ZipCodesWork.workZipCodes();

//        System.out.println("Are you going to process the Cities (c) or ZipCodes (z) ?");
//        String valueText = ReadFiles.validateStringsDirty(ReadFiles.scan.nextLine().toLowerCase());
//
//        if (valueText.equals("c")) {
//            CitiesWork.citiesActions();
//        }
//        if (valueText.equals("z")) {
//            ZipCodesWork.workZipCodes();
//        }

    }
}
