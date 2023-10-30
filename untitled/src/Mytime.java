public class Mytime {
        private  int day;
        private int hour;
        private int minute;

        public Mytime() {
        }
        public Mytime(int hour, int minute){
            this.hour=hour;
            this.minute=minute;
        }
        public Mytime(int day, int hour, int minute){
            this.day=day;
            this.hour=hour;
            this.minute=minute;
        }
        public Mytime Addtime(Mytime s){
            Mytime result = new Mytime();
            result.day=(hour+s.hour+(minute+s.minute)/60)/24;
            result.hour=((hour+s.hour+(minute+s.minute)/60)%24);
            result.minute=(minute+s.minute)%60;
        return result;
        }
        public String toString(){
            return String.format("+%d天%02d:%02d",day,hour,minute);

        }
        public String CNtoString(){
            return String.format("%02d小时%02d分钟",hour,minute);

        }
        public boolean equals(Mytime s){
            if(hour==s.hour&&minute==s.minute&&day==s.day)return false;
            else return true;

        }

    }

