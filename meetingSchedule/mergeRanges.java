public class Solution {
  public static List<Meeting> mergeRanges(List<Meeting> meetings) {
    List<Meeting> sortedMeetings = new ArrayList<Meeting>();
    for (Meeting currentMeeting : meetings) {
      sortedMeetings.add(new Meeting(currentMeeting.getStartTime(), currentMeeting.getEndTime()));
    }

    Collections.sort(sortedMeetings, new Comparator<Meeting>() {
      public int compare(Meeting m1, Meeting m2) {
        return m1.getStartTime() - m2.getStartTime();
      }
    });

    List<Meeting> mergeRanges = new ArrayList<Meeting>();
    mergeRanges.add(sortedMeetings.get(0));
    for (Meeting currentMeeting : sortedMeetings) {
      Meeting lastMeeting = mergeRanges.get(mergeRanges.size() - 1);
      if (currentMeeting.getStartTime() <= lastMeeting.getEndTime()) {
        lastMeeting.setEndTime(Math.max(currentMeeting.getEndTime(), lastMeeting.getEndTime()));
      } else {
        mergeRanges.add(currentMeeting);
      }
    }
    return mergeRanges;
  }
  public static void printResult(List<Meeting> meetings) {
    System.out.print("[");
    for (Meeting crt : meetings) {
      System.out.print("[" + crt.getStartTime() + ", " + crt.getEndTime() + "],");
    }
    System.out.print("]");
  }
  public static void main(String[] args) {
    ArrayList<Meeting> meetings = new ArrayList<Meeting>();
    Meeting m1 = new Meeting(1, 2);
    Meeting m2 = new Meeting(2, 3);
    Meeting m3 = new Meeting(4, 5);
    Meeting m4 = new Meeting(4, 7);
    Meeting m5 = new Meeting(8, 9);
    meetings.add(m1);
    meetings.add(m2);
    meetings.add(m3);
    meetings.add(m4);
    meetings.add(m5);
    printResult(mergeRanges(meetings));
  }
}
