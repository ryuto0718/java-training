public class kyotoCleaningShop implements CleaningService{
        String ownerName;       //店主の名前
        String address;         //住所
        String phone;           //電話番号
        /*シャツを洗う */
        public Shirt washShirt(Shirt s){
            //大型洗濯機１５分
            return s;
        }
        /*タオルを洗う */
        public Towl washTowl(Towl t){
            /*大型洗濯機１０分 */
            return t;
        }
        /*コートを洗う */
        public Coat washCoat(Coat c){
            //ドライ２０分
            return c;
    }
}