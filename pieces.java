public class pieces {
        private int xCor;
        private int yCor;
        private String color;
        private boolean king;

        public pieces()
        {
            xCor = 0;
            yCor = 0;
            color = "-";
            king = false;
        }

        public pieces( int x, int y, String c, boolean b)
        {
            xCor = x;
            yCor = y;
            color =c;
            king = b;
        }

        public int getX()
        {
            return xCor;
        }

        public int getY()
        {
            return yCor;
        }
        public String getColor(){
            return color;
        }

        public boolean kingStatus()
        {
            return king;
        }

    public void setKing(boolean king) {
        this.king = king;
    }

    public void setX(int x)
        {
            xCor = x;
        }

        public void setY(int y)
        {
            yCor = y;
        }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeKing(boolean k)
        {
            king = k;
            if(color.equals("r"))
                color = "R";
            else
                color = "B";
        }

}
