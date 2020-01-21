@Inject
private OptionsGroup<Integer, Integer> optionsGroupWithList;

@Subscribe
protected void onInit(InitEvent event) {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(4);
    list.add(5);
    list.add(7);
    optionsGroupWithList.setOptionsList(list);
}