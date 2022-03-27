# Lupa PDF Converter


![](https://github.com/italohcx/Lupa-Tavrida-PDF-Converter/blob/main/src/images/print.png)


> Software desenvolvido na empresa Lupa Tecnologia e Sistemas LTDA.


# 💻 Pré-requisitos

Antes de começar, verifique os seguintes requisitos:

* Instalar Java JDK 8 ou superior para compliação
* Instalar Java JRE 8 ou superiro para execução.
* Utilizar IDE Netbeans.
* Necessário a lib itextpdf.
* Compatível com:`Windows` e `Linux`.
* Para execução no `Linux` basta trocar `Windows` por `Nimbus`
```Java:
  try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
          if ("Windows".equals(info.getName())) {
              javax.swing.UIManager.setLookAndFeel(info.getClassName());
              break;
          }
      }
```

## 📁 Files

itextpdf-5.5.10.jar.
Arquivo PDF de configuração

# 🚴 Funções:

Através da API Itext, o software lê determinados parâmetros de um ou vários documentos no formato PDF, e os insere em um cabeçalho já definido, no qual o mesmo é salvo em um documento no formato txt padronizado específicamente para ser ultilizado no processo de calibração dos equipamentos de proteção.


## ⚖️ Licença

Apesar da aplicação específica, a utilização do software é livre.  
