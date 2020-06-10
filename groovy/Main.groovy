import geb.Browser

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Halina_Avdeeva\\Desktop\\DQE_Mentoring\\Final_Task\\chromedriver.exe")

Browser.drive {

    dlab = { page SSO }
    jupyter = { page Jupyter }
    jupyterNotebook = { page JupyterNotebook }

    to SSO
    dlab.epamSSOButton.click()

    at Jupyter
    waitFor() { jupyter.folder.displayed }
    jupyter.folder.click()

    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    driver.get("https://projectby.trainings.dlabanalytics.com/havdeeva89/notebooks/Required_checks.ipynb")

    at JupyterNotebook

    jupyterNotebook.cellButton.click()
    jupyterNotebook.runAllActionItem.click()

    waitFor() { $("div.output_subarea.output_html.rendered_html.output_result").displayed }

}


