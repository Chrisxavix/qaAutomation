const report = require('multiple-cucumber-html-reporter');
let fecha = new Date();

report.generate({
    jsonDir: './test/report/',
    reportPath: './test/report/',
    //Abrir el navegador después de terminar el test
    openReportInBrowser: true,
    //Duración en segundos de la prueba
    displayDuration: true,
    //La fecha de la carpeta test a crear
    displayReportTime: true,
    //Título en el template
    reportName: "Testing Fitbank",
    //Título en el TAB
    pageTitle: "Report Fitbank",
    //Footer
    pageFooter: "<div style='margin-bottom: 20px;'><figure style='text-align: center;'><a href='https://www.bancodelaustro.com'><img style='width: 300px !important; height: 35px !important;' src='https://www.bancodelaustro.com/Portals/0/LogoBancodelAustroNew.png?ver=2021-01-04-090554-537'></a></figure></div>",
    metadata:{
        browser: {
            name: 'chrome',
            version: '92.0.45'
        },
        device: 'Local test',
        platform: {
            name: 'ubuntu',
            version: '20.04'
        }
    },
    customData: {
        title: 'Run info',
        data: [
            { label: 'Project', value: 'Project Fitbank'},
            { label: 'Release', value: '1.0'},
            { label: 'Execution Start Time', value: fecha.toLocaleString()  },
        ]
    }
});