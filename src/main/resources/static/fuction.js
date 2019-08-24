


      function getDataFromAPI() {

            if ($('#supplier1').length!=1)  {
                $('#supplier1').remove();
console.log("if");
console.log($('#supplier1').length);


            } else {
                   var $suppliers1 = $('#supplier1');

                   console.log("else");
                   console.log($('#supplier1').length);
                   console.log($('#supplier1').val());
                              $.ajax({
                                        url: "/suppliers/all",
                                        type: "GET",
                                        success: function (supplierList) {
                                         $.each(supplierList , function(i , supplier){
                                            $suppliers1.append("<ul>"+supplier.supplierId+"</ul><ul>"+supplier.company+"</ul><ul>"+supplier.contactPerson+"</ul><ul>"+supplier.phoneNumber+"</ul><ul>"+supplier.email+"</ul>")
                                         });
                                        }, error: function () {
                                            alert('error adding to database');
                                        }
                                    });

            }

        }


      function addSupplier() {
       var $suppliers1 = $('#supplier1');
               var $supplierId = $('#supplierId');
               var $company = $('#company');
               var $contactPerson = $('#contactPerson');
               var $phoneNumber = $('#phoneNumber');
               var $email = $('#email');
               var modelObj = {
                   supplierId : $supplierId.val(),
                   company: $company.val(),
                   contractPerson: $contactPerson.val(),
                   phoneNumber: $phoneNumber.val(),
                   email: $email.val()
               };
               console.log(modelObj);
               $.ajax({
                   type: "POST",
                   url: "/suppliers/save",
                   data: modelObj,
                   success: function (newSupplier) {
                       $suppliers1.append("<p>"+newSupplier.supplierId+"</p><p>"+newSupplier.company+"</p><p>"+newSupplier.contactPerson+"</p><p>"+newSupplier.phoneNumber+"</p><p>"+newSupplier.email+"</p>");
                       console.log("fff" + $('#company').val());
                       $company.val('');
                       $contactPerson.val('');
                       $phoneNumber.val('');
                       $email.val('');
                       $supplierId.val('');
                       console.log( $('#company').val());
                       },
                   error: function () {
                           alert('error adding to database');
                       }

                });
        }

        function addProduct(){
                    var $productId = $('#productId');
                    var $desc = $('#desc');
                    var $companyName = $('#companyName');
                    var $width = $('#width');
                    var $length = $('#length');
                    var $height = $('#height');
                    var $weight = $('#weight');
                    var $quantityPerPack = $('#quantityPerPack');
                    var $shelfLife = $('#shelfLife');
                    var $buyingPrice = $('#buyingPrice');
                    var $sellingPrice = $('#sellingPrice');
                    var $margin = $('#margin');
                    var $profitFactor = $('#profitFactor');
                    console.log("length"+ $length);
                    var modelObj = {
                        productId : $productId.val(),
                        desc: $desc.val(),
                        companyName: $companyName.val(),
                        width: $width.val(),
                        length: $length.val(),
                        height: $height.val(),
                        weight: $weight.val(),
                        quantityPerPack: $quantityPerPack.val(),
                        shelfLife: $shelfLife.val(),
                        buyingPrice: $buyingPrice.val(),
                        sellingPrice: $sellingPrice.val(),
                        margin: $margin.val(),
                        profitFactor: $profitFactor.val(),
                    };
                    console.log(modelObj);
                    $.ajax({
                        type: "POST",
                        url: "/products/save",
                        data: modelObj,
                        success: function (newSupplier) {
                       console.log( $('#company').val());
                            },
                            error: function () {
                                alert('error adding to database');
                            }
                     });
        }


        function createExcel(){
          $.ajax({
                        type: "GET",
                        url: "/suppliers/products/excel",
                        success: function (newSupplier) {},
                         error: function () {
                                alert('fail to generate excel file');
                            }
                     });

        }