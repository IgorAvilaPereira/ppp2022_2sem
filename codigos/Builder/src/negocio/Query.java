
package negocio;

import java.util.ArrayList;

public class Query {

    private String tipo;
    private String select = "";
    private String update = "";
    private String delete = "";
    private String insert = "";
    private boolean isSelect = false;
    private boolean isUpdate = false;
    private boolean isDelete = false;
    private boolean isInsert = false;
    private String tabela = "";
    private String where = "";
    private String groupBy = "";
    private String orderBy = "";
    private String having = "";
    private String limit = "";
    private boolean threIsWhere = false;
    private boolean threIsGroupBy = false;
    private boolean threIsOrderBy = false; 
    private boolean threIsHaving = false;
    private boolean threIsLimit = false;
    private String queryFinal;

    private Query(Builder builder) {
        this.tipo = builder.tipo;
        this.select = builder.select;
        this.update = builder.update;
        this.delete = builder.delete;
        this.insert = builder.insert;
        this.isSelect = builder.isSelect;
        this.isUpdate = builder.isUpdate;
        this.isDelete = builder.isDelete;
        this.isInsert = builder.isInsert;
        this.tabela = builder.tabela;
        this.where = builder.where;
        this.groupBy = builder.groupBy;
        this.orderBy = builder.orderBy;
        this.having = builder.having;
        this.limit = builder.limit;
        this.threIsWhere = builder.threIsWhere;
        this.threIsGroupBy = builder.threIsGroupBy;
        this.threIsOrderBy = builder.threIsOrderBy;
        this.threIsHaving = builder.threIsHaving;
        this.threIsLimit = builder.threIsLimit;
        this.queryFinal = builder.queryFinal;  
    }

    public static class Builder {
        
        private String tipo;
        
        private String select = "";
        private String update = "";
        private String delete = "";
        private String insert = "";
        
        private boolean isSelect = false;
        private boolean isUpdate = false;
        private boolean isDelete = false;
        private boolean isInsert = false;
        
        private String tabela = "";
        private String where = "";
        private String groupBy = "";
        private String having = "";
        private String orderBy = "";
        private String limit = "";
        
        private boolean threIsWhere = false;
        private boolean threIsGroupBy = false;
        private boolean threIsOrderBy = false;
        private boolean threIsHaving = false;
        private boolean threIsLimit = false;
         
         private String queryFinal;
        
        public Builder(String tipo) {
            switch(tipo) {
                case "S":
                    this.isSelect = true;
                break;
                case "D":
                    this.isDelete = true;
                break;
                case "U":
                    this.isUpdate = true;
                break;
                case "I":
                    this.isInsert = true;
                break;
                default:
                    System.out.println("Você deve passar como parâmetro S, D, U ou I, que representando respectivamente select, delete, update e insert");
                    System.exit(0);
                break;
            }
        }

        public Builder select(String select) {
            if(this.isSelect == true) {
                
                if(this.select.length() == 0) {
                    this.select = "SELECT \n " + select;
                } else {
                    this.select = this.select + ", \n " + select;
                }
            }
            return this;
        }

        public Builder update(String campo, String valor) {
            if(this.isUpdate == true && this.tabela.length() > 0) {
                
                if(this.update.length() == 0) {
                    this.update = "UPDATE " + this.tabela + " SET " + campo + " = '" + valor + "'";
                } else {
                    this.update = this.update + ", " + campo + " = " + valor;
                }
                
                return this;
            }
            return this;
        }

        public Builder delete() {
             if(this.isDelete == true && this.tabela.length() > 0) {
                
                if(this.delete.length() == 0) {
                    this.delete = "DELETE FROM " + this.tabela;
                }
                
                return this;
            }
            return this;
        }
        
        public Builder insert(String valor) {
            if(this.isInsert == true && this.tabela.length() > 0) {
                
                if(this.insert.length() == 0) {
                    this.insert = "INSERT INTO " + this.tabela + " VALUES (" + valor;
                } else {
                    this.insert = this.insert + valor;
                }
                
                this.insert = this.insert + ")";
                
                return this;
            }
            return this;
        }

        public Builder tabela(String tabela) {
            this.tabela = tabela;
            return this;
        }

        public Builder where(String where) {
            if(this.threIsWhere == false) {
                 this.where =  " \nWHERE \n " + where;
                 this.threIsWhere = true;
                 return this;
            } else {
                this.where = this.where + " AND \n " + where;
            }
            return this;
        }

        public Builder groupBy(String groupBy) {
             if(this.threIsGroupBy == false) {
                 this.groupBy =  " \nGROUP BY \n " + groupBy;
                 this.threIsGroupBy = true;
                 return this;
            } else {
                this.groupBy = this.groupBy + ", \n " + groupBy;
            }
            return this;
        }

        public Builder orderBy(String orderBy) {
            if(this.threIsOrderBy == false) {
                 this.orderBy =  " \nORDER BY \n " + orderBy;
                 this.threIsOrderBy = true;
                 return this;
            } else {
                this.orderBy = this.orderBy + ",  \n " + orderBy;
            }
            return this;
        }

        public Builder having(String having) {
            if(this.threIsHaving == false) {
                 this.having =  " \nHAVING \n " + having;
                 this.threIsHaving = true;
                 return this;
            } else {
                this.having = this.having + ",  \n " + having;
            }
            return this;
        }

        public Builder limit(int limit) {
            if(this.threIsLimit == false) {
                 this.limit =  " \nLIMIT " + limit;
                 this.threIsLimit = true;
                 return this;
            }
            return this;
        }

        public Query build() {
            
            if(this.isSelect == true)
                this.queryFinal = this.select + " \nFROM " + this.tabela;
            
           if(this.isUpdate == true)
                this.queryFinal = this.update;
            
           if(this.isDelete == true)
                this.queryFinal = this.delete;
            
           if(this.isInsert == true)
                this.queryFinal = this.insert;
           
           if(this.isSelect == true) {
               this.queryFinal = this.queryFinal + this.where + this.groupBy + this.having + this.orderBy + this.limit;
           } else {
               this.queryFinal = this.queryFinal + this.where;
           }
           
            
            return new Query(this);
        }
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isIsSelect() {
        return isSelect;
    }

    public boolean isIsUpdate() {
        return isUpdate;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public boolean isIsInsert() {
        return isInsert;
    }

    public String getQueryFinal() {
        return queryFinal;
    }
}