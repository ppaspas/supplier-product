package com.example.demo.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class UpdateExcel {

    public static void setSupplierExcel(List<Supplier> suppliers, List<Product> products) throws Exception{
        String excelFilePath = "src/main/resources/templates/excelTemplate.xlsx";
        String outputPath = "src/main/resources/static/supplier.xlsx";


        try {
            FileInputStream inputStream = new FileInputStream(excelFilePath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            if(!suppliers.isEmpty() || !products.isEmpty()) {
                if (!suppliers.isEmpty()) {
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int rowCount = sheet.getLastRowNum();
                    for (Supplier supplier : suppliers) {
                        XSSFRow row = sheet.createRow(++rowCount);
                        row.createCell(0).setCellValue(supplier.getSupplierId());
                        row.createCell(1).setCellValue(supplier.getSupplier());
                        row.createCell(2).setCellValue(supplier.getContactPerson());
                        row.createCell(3).setCellValue(supplier.getPhoneNumber());
                        row.createCell(4).setCellValue(supplier.getEmail());

                    }

                }

                if (!products.isEmpty()) {
                    for (Product product : products) {
                        XSSFSheet sheet = workbook.getSheetAt(1);
                        int rowCount = sheet.getLastRowNum();
                        XSSFRow row = sheet.createRow(++rowCount);
                        row.createCell(0).setCellValue(product.getProductId());
                        row.createCell(1).setCellValue(product.getProductDesc());
                        row.createCell(2).setCellValue(product.getSupplier());
                        if (product.getWidth() != null) {
                            row.createCell(4).setCellValue(product.getWidth());
                        } else {
                            row.createCell(4).setCellValue("");
                        }
                        if (product.getLength() != null) {
                            row.createCell(4).setCellValue(product.getLength());
                        } else {
                            row.createCell(4).setCellValue("");
                        }
                        if (product.getHeight() != null) {
                            row.createCell(4).setCellValue(product.getHeight());
                        } else {
                            row.createCell(4).setCellValue("");
                        }
                        if (product.getWeight() != null) {
                            row.createCell(4).setCellValue(product.getWeight());
                        } else {
                            row.createCell(4).setCellValue("");
                        }
                        row.createCell(7).setCellValue(product.getQuantityPerPack());
                        row.createCell(8).setCellValue(product.getShelfLife());
                        if (product.getBuyingPrice() != null) {
                            row.createCell(4).setCellValue(product.getBuyingPrice());
                        } else {
                            row.createCell(4).setCellValue("");
                        }
                        row.createCell(10).setCellValue(product.getSellingPrice());
                        if (product.getMargin() != null) {
                            row.createCell(4).setCellValue(product.getMargin());
                        } else {
                            row.createCell(4).setCellValue("");
                        }
                        row.createCell(12).setCellValue(product.getProfitFactor());

                    }

                }
                FileOutputStream outputStream = new FileOutputStream(outputPath);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }

        } catch (IOException | EncryptedDocumentException ex) {
            ex.printStackTrace();
        }
    }




}
