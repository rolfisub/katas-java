package kyu6.tenminutewalk;

public class TenMinuteWalk {

    public static Boolean isValid(char[] directions) {

        Vector2D startPos = new Vector2D();
        startPos.setPosition(0,0);

        GPS gps = new GPS();
        gps.initiate(startPos);
        gps.startWalk(directions, 10);

        return gps.isCurrentPositionTheOrigin() && gps.isPersonBackOnTime();
    }

    public static class Vector2D {
        public int x;
        public int y;

        public void setPosition(int startX, int startY) {
            x = startX;
            y = startY;
        }
    }

    public static class GPS {
        private Vector2D position;
        private Vector2D origin;

        private int minutes;
        private int maxMinutes;

        public void initiate (Vector2D startPosition) {
            position = new Vector2D();
            position.setPosition(startPosition.x, startPosition.y);

            origin = new Vector2D();
            origin.setPosition(startPosition.x, startPosition.y);
        }

        public void startWalk (char[] directions, int maxTime) {
            minutes = 0;
            maxMinutes = maxTime;
            for(char direction: directions) {
                switch (direction) {
                    case 'n': this.moveNorth(); break;
                    case 's': this.moveSouth(); break;
                    case 'e': this.moveEast();  break;
                    case 'w': this.moveWest();  break;
                }
            }
        }

        public void addOneMinute() {
            minutes++;
        }

        public void moveNorth() {
            position.y++;
            this.addOneMinute();
        }

        public void moveSouth() {
            position.y--;
            this.addOneMinute();
        }

        public void moveEast() {
            position.x++;
            this.addOneMinute();
        }

        public void moveWest() {
            position.x--;
            this.addOneMinute();
        }

        public Boolean isCurrentPositionTheOrigin() {
            return position.x == origin.x && position.y == origin.y;
        }

        public Boolean isPersonBackOnTime() {
            return minutes == maxMinutes;
        }

    }
}
