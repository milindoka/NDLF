01 - Started with Fragment Tutorial Documented Here
03 - Right Click Java Files Source Folder com.examples.ndlf
       Then new New->Fragment->Fragment (List)
04 - This is deprecated so popped errors
05 - So from stack overflow answer replaced on attach code with the following

//////////////////////////////////

 @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // Code here
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            // Code here
        }
    }

/////////

06 -  Connected new Itemfragment to import menu removing demo fragment.
