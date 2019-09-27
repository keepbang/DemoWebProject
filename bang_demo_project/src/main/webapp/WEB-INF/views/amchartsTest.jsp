<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<title>chart created with amCharts | amCharts</title>
		<meta name="description" content="chart created using amCharts live editor" />
		
		<!-- amCharts javascript sources -->
		<script type="text/javascript" src="https://www.amcharts.com/lib/3/amcharts.js"></script>
		<script type="text/javascript" src="https://www.amcharts.com/lib/3/serial.js"></script>
		

		<!-- amCharts javascript code -->
		<script type="text/javascript">
			AmCharts.makeChart("chartdiv",
				{
					"type": "serial",
					"categoryField": "name",
					"rotate": true,
					"startDuration": 1,
					"categoryAxis": {
						"gridPosition": "start"
					},
					"trendLines": [],
					"graphs": [
						{
							"balloonText": "[[title]] of [[name]]:[[count]]",
							"fillAlphas": 1,
							"id": "AmGraph-1",
							"title": "graph 1",
							"type": "column",
							"valueField": "count"
						}
					],
					"guides": [],
					"valueAxes": [
						{
							"id": "ValueAxis-1",
							"title": ""
						}
					],
					"allLabels": [],
					"balloon": {},
					"legend": {
						"enabled": true,
						"useGraphSettings": true
					},
					"titles": [
						{
							"id": "Title-1",
							"size": 15,
							"text": "Chart Title"
						}
					],
					"dataProvider": [
						{
							"name": "강원도",
							"count": 138
						},
						{
							"name": "경기도",
							"count": 925
						},
						{
							"name": "경상남도",
							"count": 283
						},
						{
							"name": "경상북도",
							"count": 251
						},
						{
							"name": "광주광역시",
							"count": 113
						},
						{
							"name": "대구광역시",
							"count": 201
						},
						{
							"name": "대전광역시",
							"count": 104
						},
						{
							"name": "부산광역시",
							"count": 228
						},
						{
							"name": "서울특별시",
							"count": 599
						},
						{
							"name": "세종특별자치시",
							"count": 10
						},
						{
							"name": "울산광역시",
							"count": 78
						},
						{
							"name": "인천광역시",
							"count": 243
						},
						{
							"name": "전라남도",
							"count": 196
						},
						{
							"name": "전라북도",
							"count": 197
						},
						{
							"name": "제주특별자치도",
							"count": 61
						},
						{
							"name": "충청남도",
							"count": 216
						},
						{
							"name": "충청북도",
							"count": 130
						}
					]
				}
			);
		</script>
	</head>
	<body>
		<div id="chartdiv" style="width: 100%; height: 400px; background-color: #FFFFFF;" ></div>
	</body>
</html>