$(document).ready(function () {

    var neirong = $(".neirong")
    $(".xuanxiang").on("click",function () {
        $(".xuanxiang").removeClass('active')
        $(this).addClass('active');
        $(".xuanxiang").css("background-color","#f8f9fa")
        $(this).css("background-color","#c7d1da")
        neirong.css("display","none")
        var num =  $(".xuanxiang").index($(this))
        neirong.eq(num).css("display","block")
    })
})