var img = "imgurl";//imgurl 就是你的图片路径

function getBase64Image(img) {
    // 生成一个图片容器
    var canvas = document.createElement("canvas");

    canvas.width = img.width;
    canvas.height = img.height;
    var ctx = canvas.getContext("2d");
    ctx.drawImage(img, 0, 0, img.width, img.height);
    var ext = img.src.substring(img.src.lastIndexOf(".")+1).toLowerCase();
    var dataURL = canvas.toDataURL("image/"+ext);
    return dataURL;
}

var image = new Image();
image.src = img;
image.onload = function(){
    var base64 = getBase64Image(image);
    console.log(base64);
}