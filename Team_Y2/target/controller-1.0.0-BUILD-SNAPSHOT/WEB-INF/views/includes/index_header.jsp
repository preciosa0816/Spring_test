<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width">
  <meta name="author" content="Kyusup">
  <meta name="description" content="반응형 웹 도서관 사이트">
  <meta name="keywords" content="반응형사이트, 웹퍼블리셔, 웹접근성, HTML5">
  <title>도서관 프로젝트</title>

<!-- Bootstrap Core CSS -->
<link href="/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="/resources/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">

<!-- DataTables CSS -->
<link
	href="/resources/vendor/datatables-plugins/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link
	href="/resources/vendor/datatables-responsive/dataTables.responsive.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="/resources/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="/resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<script
				src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <!-- style -->
  <link rel="stylesheet" href="/resources/main/css/reset.css">
  <link rel="stylesheet" href="/resources/main/css/style.css">
  <link rel="stylesheet" href="/resources/main/css/font-awesome.css">
  <link rel="stylesheet" href="/resources/main/css/slick.css">
  <link rel="stylesheet" href="/resources/main/css/lightgallery.css">

  <!-- 파비콘 -->
<!--
  <link rel="shortcut icon" href="icon/favicon.ico">
  <link rel="apple-touch-icon-precomposed" href="icon/favicon-152.png">
  <link rel="icon" href="path/to/favicon.png">
  <link rel="icon" href="icon/favicon-16.png" sizes="16x16">
  <link rel="icon" href="icon/favicon-32.png" sizes="32x32">
  <link rel="icon" href="icon/favicon-48.png" sizes="48x48">
  <link rel="icon" href="icon/favicon-64.png" sizes="64x64">
  <link rel="icon" href="icon/favicon-128.png" sizes="128x128">
-->
  <!-- 웹 폰트 -->
  <link href="https://fonts.googleapis.com/css?family=Nanum+Gothic" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Nanum+Brush+Script" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">

  <!-- HTLM5shiv ie6~8 -->
  <!--[if lt IE 9]>
        <script src="js/html5shiv.min.js"></script>
        <script type="text/javascript">
            alert("현재 당신이 보는 브라우저는 지원하지 않습니다. 최신 브라우저로 업데이트해주세요!");
        </script>
    <![endif]-->
  <style>
    /* reset */
    /* 여백 초기화 */
    body,
    div,
    ul,
    li,
    dl,
    dd,
    dt,
    ol,
    h1,
    h2,
    h3,
    h4,
    h5,
    h6,
    input,
    fieldset,
    legend,
    p,
    select,
    table,
    th,
    td,
    tr,
    textarea,
    button,
    form,
    figure,
    figcaption {
      margin: 0;
      padding: 0;
    }

    /* a 링크 초기화 */
    a {
      color: #222;
      text-decoration: none;
    }

    a:hover {
      color: #2698cb;
    }

    /* 폰트 초기화 */
    body,
    input,
    textarea,
    select,
    button,
    table {
      font-family: 'Nanum Gothic', AppleSDGothicNeo-Regular, 'Malgun Gothic', '맑은 고딕', dotum, '돋움', sans-serif;
      color: #222;
      font-size: 13px;
      line-height: 1.6;
    }

    /* 폰트 스타일 초기화 */
    em,
    address {
      font-style: normal;
    }

    /* 블릿기호 초기화 */
    ul,
    li,
    ol {
      list-style: none;
    }

    /* 제목 태그 초기화 */
    h1,
    h2,
    h3,
    h4,
    h5,
    h6 {
      font-size: 13px;
      font-weight: normal;
    }

    /* 버튼 초기화 */
    button {
      border: 0;
    }

    /* 반응형 */
    img {
      width: 100%;
    }

    /* clearfix */
    .clearfix {
      *zoom: 1;
    }

    .clearfix:before,
    .clearfix:after {
      display: block;
      content: '';
      line-height: 0;
    }

    .clearfix:after {
      clear: both;
    }

    /* IR 효과 */
    .ir_pm {
      display: block;
      overflow: hidden;
      font-size: 0;
      line-height: 0;
      text-indent: -9999px;
    }

    /* 의미있는 이미지의 대체 텍스트를 제공하는 경우(Phark Method) */
    .ir_wa {
      display: block;
      overflow: hidden;
      position: relative;
      z-index: -1;
      width: 100%;
      height: 100%;
    }

    /* 의미있는 이미지의 대체 텍스트로 이미지가 없어도 대체 텍스트를 보여주고자 할 때(WA IR) */
    .ir_su {
      overflow: hidden;
      position: absolute;
      width: 0;
      height: 0;
      line-height: 0;
      text-indent: -9999px;
    }

    /* 대체 텍스트가 아닌 접근성을 위한 숨김 텍스트를 제공할 때 */

    /* margin, padding */
    .mt10 {
      margin-top: 10px !important;
    }

    .mt15 {
      margin-top: 15px !important;
    }

    .mt20 {
      margin-top: 20px !important;
    }

    .mt25 {
      margin-top: 25px !important;
    }

    .mt30 {
      margin-top: 30px !important;
    }

    .mt35 {
      margin-top: 35px !important;
    }

    .mt40 {
      margin-top: 40px !important;
    }

    .mt45 {
      margin-top: 45px !important;
    }

    .mt50 {
      margin-top: 50px !important;
    }

    /* style */
    /* 레이아웃 */
    body {
      background: url(/resources/main/img/header_bg.jpg) repeat-x center top;
    }

    #header {}

    #nav {
      background-color: #f6fdff;
    }

    #title {
      background-color: #eaf7fd;
    }

    #contents .container {
      border-right: 1px solid #dbdbdb;
      border-left: 1px solid #dbdbdb;
    }

    #cont_left {
      float: left;
      width: 250px;
    }

    #cont_center {
      overflow: hidden;
      margin-right: 250px;
      min-height: 1300px;
      border-right: 1px solid #dbdbdb;
      border-left: 1px solid #dbdbdb;
    }

    #cont_right {
      position: absolute;
      right: 0;
      top: 0px;
      width: 250px;
    }

    #footer {
      border-top: 1px solid #dbdbdb;
    }

    /* 컨테이너 */
    .container {
      position: relative;
      width: 1200px;
      margin: 0 auto;
      /* background: rgba(0,0,0,0.3) */
    }

    /* 헤더 */
    .header {
      height: 327px;
    }

    .header .header_menu {
      text-align: right;
    }

    .header .header_menu a {
      color: #fff;
      padding: 8px 0 6px 10px;
      display: inline-block;
      transition: color 0.3s ease;
      font-family: 'Abel', sans-serif;
    }

    .header .header_menu a:hover {
      color: #ccc;
    }

    .header .header_tit {
      text-align: center;
      text-transform: uppercase;
      margin-top: 55px;
      font-family: 'Abel', sans-serif;
    }

    .header .header_tit h1 {
      font-size: 30px;
      color: #fff;
      background: #51b0dc;
      display: inline-block;
      padding: 5px 30px 5px 30px;
      letter-spacing: 2px;
      font-weight: 900;
      transition: box-shadow 0.25s ease-in-out;
    }

    .header .header_tit h1:hover {
      box-shadow:
        inset -9em 0 0 0 #257FAC,
        inset 9em 0 0 0 #257FAC;
    }

    .header .header_tit a {
      font-size: 16px;
      color: #fff;
      background: #4a9abf;
      display: inline-block;
      padding: 10px 20px 10px 20px;
      margin-top: -7px;
      transition: box-shadow 0.3s ease-in-out;
    }

    .header .header_tit a:hover {
      box-shadow:
        0 0 0 5px rgba(75, 154, 191, 0.9) inset,
        0 0 0 100px rgba(0, 0, 0, 0.1) inset;
    }

    .header .header_tit body {
      width: 300px;
      margin: 0 auto;
      padding-top: 8rem;
    }

    .header .header_tit fieldset {
      position: relative;
      display: inline-block;
      padding: 0 0 0 40px;
      background: #fff;
      border: none;
      border-radius: 5px;
    }

    .header .header_tit input, button {
      position: relative;
      width: 200px;
      height: 50px;
      padding: 0;
      display: inline-block;
      float: left;
    }

    .header .header_tit input {
      color: #666;
      z-index: 2;
      border: 0 none;
    }
    .header .header_tit input:focus {
      outline: 0 none;
    }
    .header .header_tit input:focus + button {
      -webkit-transform: translate(0, 0);
          -ms-transform: translate(0, 0);
              transform: translate(0, 0);
      -webkit-transition-duration: 0.3s;
              transition-duration: 0.3s;
    }
    .header .header_tit input:focus + button .fa {
      -webkit-transform: translate(0px, 0);
          -ms-transform: translate(0px, 0);
              transform: translate(0px, 0);
      -webkit-transition-duration: 0.3s;
              transition-duration: 0.3s;
      color: #fff;
    }

    .header .header_tit button {
      z-index: 1;
      width: 50px;
      border: 0 none;
      background: #ceb980;
      cursor: pointer;
      border-radius: 0 5px 5px 0;
      -webkit-transform: translate(-50px, 0);
          -ms-transform: translate(-50px, 0);
              transform: translate(-50px, 0);
      -webkit-transition-duration: 0.3s;
              transition-duration: 0.3s;
    }

    .header .header_tit .fa-search {
      font-size: 1.4rem;
      color: #29abe2;
      z-index: 3;
      top: 25%;
      -webkit-transform: translate(-190px, 0);
          -ms-transform: translate(-190px, 0);
              transform: translate(-190px, 0);
      -webkit-transition-duration: 0.3s;
              transition-duration: 0.3s;
      -webkit-transition: all 0.1s ease-in-out;
              transition: all 0.1s ease-in-out;
    }


    .header .header_icon {
      text-align: center;
      margin-top: 40px;
      padding-bottom: 45px;
    }

    .header .header_icon li {
      display: inline;
      margin: 0 2px;
    }

    .header .header_icon li a {
      position: relative;
      background-color: #3192bf;
      border-radius: 50%;
      width: 60px;
      height: 60px;
      color: #fff;
      display: inline-block;
      font-size: 35px;
      line-height: 60px;
      transition: all 0.3s ease;
    }

    .header .header_icon li a span {
      position: absolute;
      opacity: 0;
      left: 50%;
      top: -40px;
      transform: translateX(-50%);
      font-size: 12px;
      line-height: 1.6;
      background: #3192bf;
      padding: 3px 9px;
      border-radius: 6px 0;
      transition: all 0.3s ease;
    }

    .header .header_icon li a span:before {
      content: '';
      position: absolute;
      left: 50%;
      bottom: -5px;
      margin-left: -5px;
      border-top: 5px solid #3192bf;
      border-left: 5px solid transparent;
      border-right: 5px solid transparent;
    }

    .header .header_icon li a:hover span {
      opacity: 1;
      top: -33px;
    }

    .header .header_icon li a:hover {
      box-shadow:
        0 0 0 3px rgba(75, 154, 191, 0.9) inset,
        0 0 0 100px rgba(0, 0, 0, 0.1) inset;
    }

    /* 전체 메뉴 */
    .nav {
      overflow: hidden;
      padding: 25px 0;
      display: none;
    }

    .nav>div {
      float: left;
      width: 40%;
    }

    .nav>div:last-child {
      width: 20%;
    }

    .nav>div ol {
      overflow: hidden;
    }

    .nav>div li {
      float: left;
      width: 50%;
      position: relative;
      padding-left: 8px;
      box-sizing: border-box;
    }

    .nav>div:last-child li {
      width: 100%;
    }

    .nav>div li a {
      position: relative;
    }

    .nav>div li:before {
      content: '';
      width: 3px;
      height: 3px;
      background-color: #25a2d0;
      border-radius: 50%;
      position: absolute;
      left: 0;
      top: 8px;
    }

    .nav>div h3 {
      font-size: 18px;
      color: #25a2d0;
      font-weight: bold;
      margin-bottom: 4px;
    }

    .nav>div li a:after {
      content: '';
      display: inline-block;
      width: 0;
      height: 1px;
      position: absolute;
      bottom: 0;
      left: 0;
      background: #25a2d0;
      transition: all .2s ease-out;
    }

    .nav>div li:hover a:after {
      width: 100%;
    }

    /* 타이틀 */
    .title {
      position: relative;
      text-align: center;
    }

    .title h2 {
      font-family: 'Nanum Brush Script', cursive;
      font-size: 39px;
      color: #0093bd;
      padding: 5px 0;
    }

    .title .btn {
      position: absolute;
      right: 0;
      top: 5px;
      width: 60px;
      height: 60px;
      line-height: 60px;
      background: #3192bf;
      color: #fff;
      font-size: 35px;
      border-radius: 50%;
      transition: all 0.3s ease;
    }

    .title .btn:hover {
      box-shadow:
        0 0 0 3px rgba(75, 154, 191, 0.9) inset,
        0 0 0 100px rgba(0, 0, 0, 0.1) inset;
    }

    /* 컨텐츠 영역 */
    .column {
      padding: 15px;
      border-bottom: 1px solid #dbdbdb;
    }

    .column .col_tit {
      font-size: 20px;
      color: #2f7fa6;
      padding-bottom: 5px;
    }

    .column .col_desc {
      border-bottom: 1px dashed #dbdbdb;
      padding-bottom: 15px;
      margin-bottom: 15px;
      color: #878787;
      line-height: 18px;
    }

    .column.col1 {}

    .column.col2 {}

    .column.col3 {
      border-bottom: 0;
    }

    .column.col4 {}

    .column.col5 {}

    .column.col6 {
      border-bottom: 0;
    }

    .column.col7 {}

    .column.col8 {}

    .column.col9 {
      border-bottom: 0;
    }

    /* 메뉴 */
    .menu li {
      position: relative;
    }

    .menu li a {
      font-size: 16px;
      text-transform: uppercase;
      color: #878787;
      border-bottom: 1px solid #dbdbdb;
      padding: 10px;
      display: block;
      transition: box-shadow 0.34s ease, background 0.34s ease;
    }

    .menu li a i {
      position: absolute;
      right: 10px;
      top: 15px;
    }

    .menu li a:hover {
      box-shadow: inset 180px 0 0 0 rgba(36, 130, 174, 0.7);
      color: #fff;
      background: rgba(36, 130, 174, 0.9);
    }

    /* 게시판1 */
    .notice1 {
      position: relative;
    }

    .notice1 h5 {
      font-size: 14px;
      color: #2f7fa6;
      padding-bottom: 5px;
    }

    .notice1 li {
      position: relative;
      overflow: hidden;
      text-overflow: ellipsis;
      white-space: nowrap;
      padding-left: 8px;
    }

    .notice1 li:before {
      content: '';
      width: 3px;
      height: 3px;
      border-radius: 50%;
      background: #449ce2;
      position: absolute;
      left: 0;
      top: 6px;
    }

    .notice1 .more {
      position: absolute;
      right: 0;
      top: 3px;
      color: #878787;
      text-transform: uppercase;
      font-size: 10px;
    }

    /* 게시판2 */
    .notice2 {
      position: relative;
    }

    .notice2 h5 {
      font-size: 14px;
      color: #2f7fa6;
      padding-bottom: 5px;
    }

    .notice2 li {
      position: relative;
      overflow: hidden;
      text-overflow: ellipsis;
      display: -webkit-box;
      -webkit-box-orient: vertical;
      -webkit-line-clamp: 2;
      padding-left: 8px;
      padding-bottom: 5px;
      max-height: 40px;
      /* ie */
    }

    .notice2 li:before {
      content: '';
      width: 3px;
      height: 3px;
      border-radius: 50%;
      background: #449ce2;
      position: absolute;
      left: 0;
      top: 6px;
    }

    .notice2 .more {
      position: absolute;
      right: 0;
      top: 3px;
      color: #878787;
      text-transform: uppercase;
      font-size: 10px;
    }

    /* 블로그1 */
    .blog1 img {
      width: 100%;
    }

    .blog1 .img-retina {
      display: none;
    }

    @media only screen and (-webkit-min-device-pixel-ratio: 1.5),
    only screen and (min-device-pixel-ratio: 1.5),
    only screen and (min-resolution: 1.5dppx) {
      .blog1 .img-retina {
        display: initial;
      }

      .blog1 .img-normal {
        display: none;
      }
    }

    /* 블로그2 */
    .blog2 h5 {
      color: #fff;
      text-align: center;
      padding: 30px 30px;
      text-transform: uppercase;
    }

    .blog2 p {
      padding-top: 5px;
    }

    .blog2 .img-retina {
      background-image: url(/resources/main/img/blog3_@1.jpg);
      background-size: cover;
    }

    @media only screen and (-webkit-min-device-pixel-ratio: 1.5),
    only screen and (min-device-pixel-ratio: 1.5),
    only screen and (min-resolution: 1.5dppx) {
      .blog2 .img-retina {
        background-image: url(/resources/main/img/blog3_@2.jpg);
      }
    }

    /* 이미지 슬라이드 */
    .slider figure {
      position: relative;
    }

    .slider figcaption {
      position: absolute;
      bottom: 0;
      left: 0;
      width: 100%;
      padding: 20px;
      box-sizing: border-box;
      background-color: rgba(0, 0, 0, 0.5);
      color: #fff;
      font-size: 18px;
    }

    .slider figcaption em {
      display: block;
      font-weight: bold;
      font-size: 28px;
      text-transform: uppercase;
      font-family: 'Abel', sans-serif;
      opacity: 0;
      transform: translateX(50px);
      transition: all .84s ease;
    }

    .slider figcaption span {
      display: block;
      overflow: hidden;
      text-overflow: ellipsis;
      white-space: nowrap;
      opacity: 0;
      transform: translateX(50px);
      transition: all .84s 0.2s ease;
    }

    .slider .slick-active figcaption em {
      opacity: 1;
      transform: translateX(0)
    }

    .slider .slick-active figcaption span {
      opacity: 1;
      transform: translateX(0)
    }

    .slider .slick-dots {
      display: block;
      width: 100%;
      text-align: center;
    }

    .slider .slick-dots li {
      display: inline-block;
      width: 15px;
      height: 15px;
      margin: 5px;
    }

    .slider .slick-dots li button {
      font-size: 0;
      line-height: 0;
      display: block;
      width: 15px;
      height: 15px;
      cursor: pointer;
      background: #5dbfeb;
      border-radius: 50%;
    }

    .slider .slick-dots li.slick-active button {
      background: #2b91c8;
    }

    .slider .slick-prev {
      position: absolute;
      left: 0;
      bottom: 0;
      z-index: 1000;
      width: 30px;
      height: 30px;
      display: inline-block;
      font: normal normal normal 14px/1 FontAwesome;
      text-indent: -9999px;
    }

    .slider .slick-prev::before {
      content: "\f053";
      color: #5dbfeb;
      text-indent: 0;
      position: absolute;
      left: 9px;
      top: 8px;
    }

    .slider .slick-next {
      position: absolute;
      right: 0;
      bottom: 0;
      z-index: 1000;
      width: 30px;
      height: 30px;
      display: inline-block;
      font: normal normal normal 14px/1 FontAwesome;
      text-indent: -9999px;
    }

    .slider .slick-next::before {
      content: "\f054";
      color: #5dbfeb;
      text-indent: 0;
      position: absolute;
      left: 11px;
      top: 8px;
    }

    /* 라이트 박스 */
    .square a {
      float: left;
      width: 19%;
      margin: 0.5%;
      position: relative;
      overflow: hidden;
    }

    .square a img {
      width: 100%;
      display: block;
    }

    .square a em {
      background: rgba(0, 0, 0, 0.77);
      color: #fff;
      width: 100%;
      text-align: center;
      position: absolute;
      left: 0;
      bottom: -30px;
      opacity: 1;
      transition: all .3s ease;
    }

    .square a:hover em {
      bottom: 0;
      background: rgba(0, 0, 0, 0.57);
    }

    .square a:nth-child(1):hover img {
      filter: blur(2px);
    }

    .square a:nth-child(2):hover img {
      filter: brightness(50%);
    }

    .square a:nth-child(3):hover img {
      filter: contrast(10%);
    }

    .square a:nth-child(4):hover img {
      filter: grayscale(100%);
    }

    .square a:nth-child(5):hover img {
      filter: hue-rotate(120deg);
    }

    .square a:nth-child(6):hover img {
      filter: invert(100%);
    }

    .square a:nth-child(7):hover img {
      filter: opacity(10%);
    }

    .square a:nth-child(8):hover img {
      filter: saturate(10%);
    }

    .square a:nth-child(9):hover img {
      filter: sepia(120%);
    }

    .square a:nth-child(10):hover img {
      filter: sepia(120%) hue-rotate(120deg);
    }

    /* 비디오 */
    .video {
      position: relative;
      width: 100%;
      padding-bottom: 56.25%;
    }

    .video iframe {
      position: absolute;
      width: 100%;
      height: 100%;
    }

    /* 푸터 */
    .footer {
      text-align: center;
      padding: 30px 50px;
    }

    .footer li {
      position: relative;
      display: inline;
      padding: 0 7px 0 10px;
      white-space: nowrap;
    }

    .footer li:before {
      content: '';
      width: 1px;
      height: 12px;
      background-color: #dbdbdb;
      position: absolute;
      left: 0;
      top: 2px;
    }

    .footer li:first-child:before {
      width: 0;
    }

    .footer address {
      padding-top: 15px;
    }

    /* 사이드 이펙트1 */
    .side1 {
      position: relative;
      display: block;
      perspective: 600px;
    }

    .side1 .front {
      transform-style: preserve-3d;
      transform: rotateY(0deg);
      transition: all 0.5s ease-in-out;
      backface-visibility: hidden;
    }

    .side1 .back {
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      z-index: -1;
      transform-style: preserve-3d;
      color: #fff;
      background: #4038DC;
      text-align: center;
      transform: rotateY(-180deg);
      transition: all 0.5s ease-in-out;
      backface-visibility: hidden;
    }

    .side1 .back i {
      position: absolute;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%);
    }

    .side1:hover .front {
      transform: rotateY(180deg);
    }

    .side1:hover .back {
      transform: rotateY(0deg);
      z-index: 1;
    }

    /* 사이드 이펙트2 */
    .side2 {
      position: relative;
      display: block;
      perspective: 600px;
    }

    .side2 .front {
      transform-style: preserve-3d;
      transform: rotateY(0deg);
      transition: all 0.5s ease-in-out;
      backface-visibility: hidden;
    }

    .side2 .back {
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      z-index: -1;
      transform-style: preserve-3d;
      transform: rotateY(-180deg);
      transition: all 0.5s ease-in-out;
      backface-visibility: hidden;
    }

    .side2 .front figcaption {
      position: absolute;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%) translateZ(100px);
      display: block;
      text-align: center;
    }

    .side2 .back figcaption {
      position: absolute;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%) translateZ(100px);
      color: #fff;
      font-size: 20px;
      display: block;
      text-align: center;
    }

    .side2 figcaption {
      width: 60%;
    }

    .side2 figcaption h3 {
      color: #fff;
      font-size: 20px;
      font-family: 'Abel', sans-serif;
      font-weight: bold;
      background: rgba(0, 0, 0, 0.4);
      padding: 3px 10px;
    }

    .side2 figcaption p {
      font-size: 14px;
    }

    .side2:hover .front {
      transform: rotateY(180deg);
    }

    .side2:hover .back {
      transform: rotateY(0deg);
      z-index: 1;
    }

    /* 사이드 이펙트3 */
    .side3 {
      position: relative;
      overflow: hidden;
      background: #000;
    }

    .side3 figcaption {
      position: absolute;
      top: 50%;
      left: 50%;
      color: #fff;
      text-align: center;
      opacity: 0;
      text-transform: uppercase;
      transition: all 0.3s ease;
      transform: translate(350%, -50%) rotate(180deg);
    }

    .side3 figcaption:after {
      content: '';
      width: 100px;
      height: 100px;
      background: #000;
      border-radius: 50%;
      position: absolute;
      left: 50%;
      top: 50%;
      z-index: -1;
      transform: translate(-50%, -50%);
    }

    .side3 figcaption h3 {
      font-size: 16px;
    }

    .side3 figcaption em {
      display: block;
      font-weight: bold;
    }

    .side3 img {
      display: block;
      transition: all 0.3s ease;
    }

    .side3:hover img {
      opacity: 0.4;
    }

    .side3:hover figcaption {
      transform: translate(-50%, -50%) rotate(0deg);
      opacity: 1;
    }


    /* mediaquery */
    /* 화면 너비 0~1220px */
    @media (max-width: 1220px) {
      .container {
        width: 100%;
      }

      .row {
        padding: 0 15px;
      }

      #cont_center {
        min-height: 1350px;
      }

      #contents .container {
        border: 0;
      }

      .title .btn {
        right: 15px;
      }

      .square a {
        width: 24%
      }

      .square a:nth-child(5n) {
        display: none;
      }
    }

    /* 화면 너비 0~1024px */
    @media (max-width: 1024px) {
      .square a {
        width: 32.33333%
      }

      .square a:nth-child(5) {
        display: block;
      }
    }

    /* 화면 너비 0~960px */
    @media (max-width: 960px) {
      #cont_right {
        position: static;
        width: 100%;
        border-top: 1px solid #dbdbdb;
      }

      #cont_center {
        margin-right: 0;
        border-right: 0;
      }

      .nav>div {
        float: none;
        width: 100%;
      }

      .nav>div:last-child {
        width: 100%;
      }

      .nav>div li {
        width: 33.333%;
      }

      .nav>div:last-child li {
        width: 33.333%;
      }

      .nav>div ol {
        margin-bottom: 10px;
      }

      #cont_right {
        overflow: hidden;
      }

      #cont_right .column {
        float: left;
        width: 33.333%;
        box-sizing: border-box;
      }

      #cont_right .column.col7 {
        border-right: 1px solid #dbdbdb;
        border-bottom: 0;
      }

      #cont_right .column.col8 {
        border-right: 1px solid #dbdbdb;
        border-bottom: 0;
      }
    }

    /* 화면 너비 0~768px */
    @media (max-width: 768px) {
      #cont_left {
        float: none;
        width: 100%;
      }

      #cont_center {
        border-left: 0;
      }
    }

    /* 화면 너비 0~600px */
    @media (max-width: 600px) {
      .header {
        height: auto;
      }

      .nav>div li {
        width: 50%;
      }

      .nav>div:last-child li {
        width: 50%;
      }

      .header .header_tit {
        display: none;
      }

      .header .header_icon {
        display: none;
      }

      .title .btn {
        display: none;
      }

      .column.col1 .col_tit {
        display: none;
      }

      .column.col1 .col_desc {
        display: none;
      }

      .column.col1 .menu li a i {
        display: none;
      }

      .column.col1 {
        padding: 0;
        border-bottom: 0;
      }

      .column.col1 .menu ul {
        overflow: hidden;
      }

      .column.col1 .menu li {
        float: left;
        width: 33.33333%;
        text-align: center;
        border-right: 1px solid #dbdbdb;
        box-sizing: border-box;
      }

      .column.col1 .menu li:nth-child(3n) {
        border-right: 0;
      }

      .column.col1 .menu li a {
        color: #fff;
        text-shadow: 0 0 5px rgba(0, 0, 0, 0.7);
      }

      .column.col1 .menu li a:hover {
        box-shadow: none;
        background: rgba(36, 130, 174, 0.3);
      }

      .column.col2 {
        background: #fff;
      }

      .column.col4 {
        border-top: 1px solid #dbdbdb;
      }

      #cont_right .column {
        width: 50%;
      }

      #cont_right .column.col8 {
        border-right: 0;
      }

      #cont_right .column.col9 {
        display: none;
      }

      .slider figcaption {
        padding: 10px;
      }

      .slider figcaption em {
        font-size: 18px;
      }

      .slider figcaption span {
        font-size: 14px;
      }

      .square a {
        width: 49%
      }

      .square a:nth-child(5) {
        display: none;
      }
    }

    /* 화면 너비 0~480px */
    @media (max-width: 480px) {}

    /* 화면 너비 0~320px */
    @media (max-width: 320px) {
      #cont_right .column {
        width: 100%;
      }

      #cont_right .column.col7 {
        border-right: 0;
        border-bottom: 1px solid #dbdbdb;
      }

      .square a {
        width: 100%;
        margin-left: 0;
        margin-right: 0;
      }
    }


  </style>
</head>

<body>

  <header id="header">
    <div class="container">
      <div class="row">
        <div class="header">
          <div class="header_menu">
            <a href="/customLogin">로그인</a>
            <a href="#">회원가입</a>
            <select name = "language">
              <option value="ko">한국어</option>
              <option value="en">English</option>
            </select>
          </div>
          <!-- //header_menu -->
          <div class="header_tit">
            <form>
              <fieldset>
                <input type="search"/>
                  <button type="submit"><i class="fa fa-search"></i></button>
              </fieldset>
            </form>
          </div>
          <!-- //header_tit -->
<!--          <div class="header_icon">
            <ul>
              <li><a href="#"><i class="fa fa-html5" aria-hidden="true"></i><span>HTML5</span></a></li>
              <li><a href="#"><i class="fa fa-github" aria-hidden="true"></i><span>GitHub</span></a></li>
              <li><a href="#" class="facebook"><i class="fa fa-facebook-square" aria-hidden="true"></i><span>Fackbook</span></a></li>
              <li><a href="#" class="twitter"><i class="fa fa-twitter" aria-hidden="true"></i><span>twitter</span></a></li>
            </ul>
          </div>
-->
          <!-- //header_icon -->
        </div>
      </div>
    </div>
  </header>
  <!-- //nav -->

  <nav id="nav">
    <div class="container">
      <div class="row">
        <div class="nav">
          <h2 class="ir_su">전체 메뉴</h2>
          <div>
            <h3>도서관 소개</h3>
            <ol>
              <li><a href="#">도서관 소개</a></li>
              <li><a href="#">도서관 시설</a></li>
              <li><a href="#">도서관 이용 안내</a></li>
              <li><a href="#">찾아오시는 길</a></li>
            </ol>
          </div>
          <div>
            <h3>도서 관리</h3>
            <ol>
              <li><a href="#">소장 도서 관리</a></li>
              <li><a href="#">예약 도서 관리</a></li>
              <li><a href="#">희망 도서 관리</a></li>
              <li><a href="#">추천 도서 관리</a></li>
            </ol>
          </div>
          <div>
            <h3>열람실 관리</h3>
            <ol>
              <li><a href="#">열람실 예약</a></li>
            </ol>
          </div>
          <div>
            <h3>공지사항</h3>
            <ol>
              <li><a href="#">공지사항</a></li>
            </ol>
          </div>
          <div>
            <h3>게시판</h3>
            <ol>
              <li><a href="/forum/list">자유 게시판</a></li>
              <li><a href="#">Q&A 게시판</a></li>
            </ol>
          </div>
        </div>
      </div>
    </div>
  </nav>
  <!-- //nav -->

  <article id="title">
    <div class="container">
      <div class="title">
        <h2>list</h2>
        <a href="#" class="btn"><i class="fa fa-angle-down" aria-hidden="true"></i><span class="ir_su">전체메뉴 보기</span></a>
      </div>
    </div>
  </article>
  <!-- //title -->

  <!-- JavaScript Libraries -->
  <script src="js/jquery.min_1.12.4.js"></script>
  <script src="js/modernizr-custom.js"></script>
  <script src="js/slick.min.js"></script>
  <script src="js/lightgallery.min.js"></script>
  <script>
    //접기/펼치기
    $(".btn").click(function(e) {
      e.preventDefault();
      $(".nav").slideToggle();
      $(".btn").toggleClass("open");
      //var btn = $(".btn").find(">i").attr("class");
      //alert(btn);

      if ($(".btn").hasClass("open")) {
        //open이 있을 때
        $(".btn").find(">i").attr("class", "fa fa-angle-up");
      } else {
        //open이 없을 때
        $(".btn").find(">i").attr("class", "fa fa-angle-down");
      }
    });

    $(window).resize(function() {
      var wWidth = $(window).width();
      if (wWidth > 600) {
        $(".nav").removeAttr("style");
      }
    });

    //라이트 박스
    $(".lightbox").lightGallery({
      thumbnail: true,
      autoplay: true,
      pause: 3000,
      progressBar: true
    });

    //이미지 슬라이더
    $(".slider").slick({
      dots: true,
      autoplay: true,
      autoplaySpeed: 3000,
      arrows: true,
      responsive: [{
        breakpoint: 768,
        settings: {
          autoplay: false,
        }
      }]
    });

    //sns 공유하기
    $(".facebook").click(function(e) {
      e.preventDefault();
      window.open('https://www.facebook.com/sharer/sharer.php?u=' + encodeURIComponent(document.URL) + '&t=' + encodeURIComponent(document.title), 'facebooksharedialog',
        'menubar=no, toolbar=no, resizable=yes, scrollbars=yes, height=300, width=600');
    });
    $(".twitter").click(function(e) {
      e.preventDefault();
      window.open('https://twitter.com/intent/tweet?text=[%EA%B3%B5%EC%9C%A0]%20' + encodeURIComponent(document.URL) + '%20-%20' + encodeURIComponent(document.title), 'twittersharedialog',
        'menubar=no, toolbar=no, resizable=yes, scrollbars=yes, height=300, width=600');
    });
  </script>
      <!-- Bootstrap Core JavaScript -->
    <script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="/resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="/resources/vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/resources/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="/resources/vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="/resources/dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
        
//       메뉴 펼쳐짐 방지
        $(".sidebar-nav")
        .attr("class","sidebar-nav navbar-collapse collapse")
        .attr("aria-expanded",'false')
        .attr("style","height:1px");
    });
    </script>
</body>

</html>
