$(".whack1").click(function(){
    $(".mole1, .whack1").hide();
});
    
$(".whack2").click(function(){
    $(".moleTwo, .whack2").hide();
});
    
$(".whack3").click(function(){
    $(".thirdMole, .whack3").hide();
});
    
$(".reset").click(function(){
    $(".mole1, .moleTwo, .thirdMole").show();
});
$(".cheat").click(function(){
    $(".mole1, .moleTwo, .thirdMole, .whack1, .whack2, .whack3").toggle();
});
