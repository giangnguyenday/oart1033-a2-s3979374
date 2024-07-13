new Swiper("#swiper_1", {

pagination: {
    el: "#swiper_1 .swiper-pagination"
},
loop: true,
navigation:{
    nextEl: "#image_slider_right_1",
    prevEl:"#image_slider_left_1",
}
});

new Swiper("#swiper_2", {

pagination: {
    el: "#swiper_2 .swiper-pagination"
},
loop: true,
navigation:{
    nextEl: "#image_slider_right_2",
    prevEl:"#image_slider_left_2",
}
});

new Swiper("#swiper_3", {

pagination: {
    el: "#swiper_3 .swiper-pagination"
},
loop: true,
navigation:{
    nextEl: "#image_slider_right_3",
    prevEl:"#image_slider_left_3",
}
});

new Swiper("#swiper_4", {

pagination: {
    el: "#swiper_4 .swiper-pagination"
},
loop: true,
navigation:{
    nextEl: "#image_slider_right_4",
    prevEl:"#image_slider_left_4",
}
});

function myFunction() {
  var x = document.getElementById("dropdown");
  if (window.getComputedStyle(x, null).getPropertyValue("display") === 'none') {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

let coverparallax = document.getElementById('cover_background_elements');

window.addEventListener('scroll', function(){
let value = window.scrollY;
coverparallax.style.bottom = value * 0.02 + 'vw';
})

function myFunction2() {
  var x = document.getElementById("dropdown");
  if (window.getComputedStyle(x, null).getPropertyValue("display") === 'none') {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

