# Auditoría Cósmica: El Detector de Primos

---

# 1. Nivel 1
- Ejecutar factor con el número introducido y mostrar toda la salida directamente en la consola.
- Ejemplo de salida correcta:
- ![img_1.png](../Tarea02PSP/Capturas/img_1.png)
- Ejemplo de salida con un dato incorrecto:![img_2.png](../Tarea02PSP/Capturas/img_2.png)
---

# 2. Tabla de Pruebas de Ejecución

A continuación se muestran los resultados obtenidos al probar el comando `factor` con los 5 valores requeridos:

| Valor | Salida de factor | Código de salida |
| :--- | :--- | :---: |
| 360 | 360: 2 2 2 3 3 5 | 0 |
| 1 | 1: | 0 |
| 17 | 17: 17 | 0 |
| hola | factor: 'hola' no es un entero positivo valido | 1 |
| -5 | factor: opcion invalida -- '5' | 1 |
![img_3.png](../Tarea02PSP/Capturas/img_3.png)
---



**Errores:**  
Al principio se me congelaba todo y no me daba ninguna respuesta a cualquiera de las 4 numeros que me pedia, y para solucionarlo tenia que poner bien el wait.for porque los getInputStream y getErrorStream se bloqueaban
# Nivel 2
![img_4.png](../Tarea02PSP/Capturas/img_4.png)