<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/calculatorStyles.css">
        <title>JSP Page</title>
    </head>
    <body>

        <div id='calc-contain'>

            <form name="calculator" action="calcservlet" method="POST">

                <input type="text" name="answer" />
                <br>

                <input type="button" value=" 1 " onclick="calculator.answer.value += '1'" />
                <input type="button" value=" 2 " onclick="calculator.answer.value += '2'" />
                <input type="button" value=" 3 " onclick="calculator.answer.value += '3'" />
                <input type="button" value=" + " onclick="calculator.answer.value += '+'" />
                <br/>

                <input type="button" value=" 4 " onclick="calculator.answer.value += '4'" />
                <input type="button" value=" 5 " onclick="calculator.answer.value += '5'" />
                <input type="button" value=" 6 " onclick="calculator.answer.value += '6'" />
                <input type="button" value=" - " onclick="calculator.answer.value += '-'" />
                </br>

                <input type="button" value=" 7 " onclick="calculator.answer.value += '7'" />
                <input type="button" value=" 8 " onclick="calculator.answer.value += '8'" />
                <input type="button" value=" 9 " onclick="calculator.answer.value += '9'" />
                <input type="button" value=" x " onclick="calculator.answer.value += '*'" />
                </br>

                <input type="button" value=" c " onclick="calculator.answer.value = ''" />
                <input type="button" value=" 0 " onclick="calculator.answer.value += '0'" />
                <input type="submit" value=" = " />
                <input type="button" value=" / " onclick="calculator.answer.value += '/'" />
                </br>

            </form>

            <div id="agh">
                <p>Develop by: D-Tech
            </div>

        </div>

    </body>
</html>
