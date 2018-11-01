package br.com.pattern.builder.solution;

public class Cake {

    private String name;

    private Boolean chocolate;

    private Boolean strawberry;

    private Double size;


    public Cake(){}

    private Cake(Builder builder){
        this.chocolate = builder.chocolate;
        this.name = builder.name;
        this.size = builder.size;
        this.strawberry = builder.strawberry;
    }

    public static class Builder {

        private String name;

        private Boolean chocolate;

        private Boolean strawberry;

        private Double size;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder withChocolate(Boolean bol) {
            this.chocolate = bol;
            return this;
        }

        public Builder withStrawberrys(Boolean bol) {
            this.strawberry = bol;
            return this;
        }

        public Builder setSize(Double size) {
            this.size = size;
            return this;

        }

        public Cake build(){
            return new Cake(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChocolate() {
        return chocolate;
    }

    public void setChocolate(Boolean chocolate) {
        this.chocolate = chocolate;
    }

    public Boolean getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(Boolean strawberry) {
        this.strawberry = strawberry;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
