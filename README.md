# FormatacaoBR
Este projeto foi escrito para ser usado em applicativos Android.

# Propósito
 * A classe Mask.java ajuda você a fazer a formatação de CNPJ, CPF, CEP e Telefones.
 * A Classe Validation.java ajuda você a fazer a validação/calculo de CNPJ, CPF.

# Uso

Copie a classe para o seu projeto.

# Implementação

#### Formatando automaticamente.
    //Adicionando um TextWatcher do tipo CNPJ em um EditText.
    seuEditText.addTextChangedListener(Mask.insert(Mask.MaskType.CNPJ, seuEditText));
        
    //Adicionando um TextWatcher do tipo CPF em um EditText.
    seuEditText.addTextChangedListener(Mask.insert(Mask.MaskType.CPF, seuEditText));
    
    //Adicionando um TextWatcher do tipo CEP em um EditText.
    seuEditText.addTextChangedListener(Mask.insert(Mask.MaskType.CEP, seuEditText));
    
    //Adicionando um TextWatcher do tipo TEL(Telefone) em um EditText.
    seuEditText.addTextChangedListener(Mask.insert(Mask.MaskType.TEL, seuEditText));
    
#### Formatando manualmente.

    //Formatando um CNPJ e mostrando em um TextView
    seuTextView.setText(Mask.mask(Mask.MaskType.CNPJ, seuCnpjString));
    
    //Formatando um CPF e mostrando em um TextView
    seuTextView.setText(Mask.mask(Mask.MaskType.CPF, seuCpfString));
    
    //Formatando um CEP e mostrando em um TextView
    seuTextView.setText(Mask.mask(Mask.MaskType.CEP, seuCepString));
    
    //Formatando um TEL(telefone) e mostrando em um TextView
    seuTextView.setText(Mask.mask(Mask.MaskType.TEL, seuTelefoneString));
    
#### Limpando a formatação.

    String s = Mask.unmask(suaInformacaoFormatada);
    
    
#### Validando.

    //Validando o CNPJ informado, retorna boolean.  
    Validation.isValidCNPJ(seuCNPJString);

    //Validando o CPF informado, retorna boolean.
    Validation.isValidCPF(seuCPFString);
    
    
