package com.projet.demo.exception;

public enum MesCode {
ERROR_SUPPRESSION_CLIENT(100),
ERROR_NOTFOUND(404),
ERROR_SUPPRESSION_FOURNISSEUR(1200);
    private Integer code;
    public Integer getCode() {
        return code;
    }
MesCode(Integer code){
    this.code=code;
}
}
