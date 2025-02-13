public enum Weekday {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);
    private boolean isWeekday;
    Weekday(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    public boolean isWeekday() {
        return isWeekday;
    }
    public boolean isHolyday() {
        return !isWeekday;
    }
}

