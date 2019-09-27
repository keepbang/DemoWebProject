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
							"name": "������",
							"count": 138
						},
						{
							"name": "��⵵",
							"count": 925
						},
						{
							"name": "��󳲵�",
							"count": 283
						},
						{
							"name": "���ϵ�",
							"count": 251
						},
						{
							"name": "���ֱ�����",
							"count": 113
						},
						{
							"name": "�뱸������",
							"count": 201
						},
						{
							"name": "����������",
							"count": 104
						},
						{
							"name": "�λ걤����",
							"count": 228
						},
						{
							"name": "����Ư����",
							"count": 599
						},
						{
							"name": "����Ư����ġ��",
							"count": 10
						},
						{
							"name": "��걤����",
							"count": 78
						},
						{
							"name": "��õ������",
							"count": 243
						},
						{
							"name": "���󳲵�",
							"count": 196
						},
						{
							"name": "����ϵ�",
							"count": 197
						},
						{
							"name": "����Ư����ġ��",
							"count": 61
						},
						{
							"name": "��û����",
							"count": 216
						},
						{
							"name": "��û�ϵ�",
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