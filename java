$(".whack1").click(function(){
    $(".mole1").hide();
});
    
$(".whack2").click(function(){
    $(".moleTwo").hide();
});
    
$(".whack3").click(function(){
    $(".thirdMole").hide();
});
    
$(".reset").click(function(){
    $(".mole1, .moleTwo, .thirdMole").show();
});
