package com.mylittleadventurer.mylittleadventurer.model;

import com.mylittleadventurer.mylittleadventurer.R;

/**
 * Created by AngelaPinaroc on 15/06/16.
 * GRANDPA's OLD WATCH STORY
 */
public class Story1 {
    private Page[] mPages;

    public Story1() {

        mPages = new Page[9];

        mPages[0] = new Page(
                R.drawable.story1_boy_page1,
                R.drawable.story1_girl_page1,
//page 1
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s had just finished his homework, he realized it was late so he quickly changed into his cozy pajamas. As he was just about to go to sleep, he saw light coming out from his toy chest." +
                        "\n\n\"What is that?\" wondered %1$s. \"Why is there light shining out of my toy chest? That’s strange, I thought I had turned all of my toys off. What could it be?\".\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s had just finished her homework, she realized it was late so she quickly changed into her pajamas. As she was just about to go to sleep, she saw light coming out from her toy chest." +
                        "\n\n\"What is that?\" wondered %1$s. \"Why is there light shining out of my toy chest? That’s strange, I thought I had turned all of my toys off. What could it be?\".\n",

                new Choice("Investigate the source of light", 1),
                //go to page 2
                new Choice("Turn off the light & go to sleep", 2));
        //go to page 3
        mPages[1] = new Page(
                R.drawable.story1_boy_page2,
                R.drawable.story1_girl_page2,
//page 2
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s approached the box slowly, lifted the lid and a magical surprise appeared before him...The blinking light was shining brightly from Grandpa’s old watch!" +
                        "\n\nWith big wide open eyes, %1$s grabbed the watch & put it on." +
                        "\n\n\"I wonder what happens if I press one of this blinking lights,\" asked %1$s while staring at the watch and deciding whether to press the green or red button.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s approached the box slowly, lifted the lid and a magical surprise appeared before her...The blinking light was shining brightly from Grandpa’s old watch!" +
                        "\n\nWith big wide open eyes, %1$s grabbed the watch & put it on." +
                        "\n\n\"I wonder what happens if I press one of this blinking lights,\" asked %1$s while staring at the watch and deciding whether to press the green or red button.\n",

                new Choice("Choose to press the Green Button", 3),
                // go to page 4
                new Choice("Choose to press the Red Button", 4));
        //go to page 5
        mPages[2] = new Page(
                R.drawable.story1_boy_page3,
                R.drawable.story1_girl_page3,
//page 3
                /*******************
                 * BOY VERSION
                 *******************/
                "\"It's late, I’ll just check it in the morning.\" said %1$s to himself as he crawled into his soft, comfy bed." +
                        "\n\nAs the sun began to shine brightly through his curtains, %1$s heard his mum calling... \"%1$s! breakfast is ready, your dad and I are waiting for you!\"" +
                        "\n\n%1$s hurriedly swung his legs out of bed, and shouted \"COMING, MUM!\" " +
                        "\n\nAs he began to get ready he noticed Grandpa’s old watch strapped around his wrist with the green and red lights blinking. \"Huh? I don't remember putting this watch on.\" said confused %1$s .\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "\"It's late, I’ll just check it in the morning.\" said %1$s to herself as she crawled into her soft, comfy bed." +
                        "\n\nAs the sun began to shine brightly through her curtains, %1$s heard her mum calling... \"%1$s! breakfast is ready, your dad and I are waiting for you!\"" +
                        "\n\n%1$s hurriedly swung her legs out of bed, and shouted \"COMING, MUM!\" " +
                        "\n\nAs she began to get ready she noticed Grandpa’s old watch strapped around her wrist with the green and red buttons blinking. \"Huh? I don't remember putting this watch on.\" said confused %1$s .\n",

                new Choice("Choose to press the Green Button", 3),
                // go to page 4
                new Choice("Choose to press the Red Button", 4));
        //go to page 5

        mPages[3] = new Page(
                R.drawable.story1_boy_page4,
                R.drawable.story1_girl_page4,
//page 4
                /*******************
                 * BOY VERSION
                 *******************/
                "Ever curious, %1$s decided to press the green button. The watch hands began whizzing around so fast, suddenly he found himself transported to a strange land. " +
                        "\n\n%1$s heard sounds from above. And when he lifted his head towards the bright blue sky, he surprisingly saw objects flying around him." +
                        "\n\n\"Flying cars! That is Awesome!\" %1$s exclaimed.\"" +
                        "\n\n%1$s excitingly began to climb the stair that leads to the giant marshmallow cloud. Grabbing a huge portion of marshmallow as he took each step. \"Yummy! I wish Mum and Dad were here… I can imagine Mum putting this marshmallow into her cakes.\" said %1$s\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "Ever curious, %1$s decided to press the green button. The watch hands began whizzing around so fast, suddenly she found herself transported to a strange land. " +
                        "\n\n%1$s heard sounds from above. And when she lifted her head towards the bright blue sky, she surprisingly saw objects flying around her." +
                        "\n\n\"Flying cars! That is Awesome!\" %1$s exclaimed.\"" +
                        "\n\n%1$s excitingly began to climb the stair that leads to the giant marshmallow cloud. Grabbing a huge portion of marshmallow as she took each step. \"Yummy! I wish Mum and Dad were here… I can imagine Mum putting this marshmallow into her cakes.\" said %1$s\n",
                new Choice("Oops, it’s getting late, go back home!", 5),
                //go to page 6
                new Choice("Explore what more the watch can do", 6));
        //go to page 7

        mPages[4] = new Page(
                R.drawable.story1_boy_page5,
                R.drawable.story1_girl_page5,
//page 5
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s decided to slowly press the red button down and everything around him faded slowly. %1$s found himself in a grand ball and everyone were wearing fancy dresses, smiling, cheering and dancing. " +
                        "\n\n\"Am I actually seeing real Prince and Princesses?\" %1$s quietly said to himself as he saw them arrived in a carriage pulled by elegant horses ." +
                        "\n\n%1$s moved towards the banquets piled high with food, cut himself the biggest slice he had ever eaten and poured himself a giant glass of milk." +
                        "\n\n\"Yummy! Wish Mum & Dad were here though, Dad would love this cake!\" said %1$s while rubbing his belly.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s decided to slowly press the red button down and everything around her faded slowly. %1$s found herself in a grand ball and everyone were wearing fancy dresses, smiling, cheering and dancing. " +
                        "\n\n\"Am I actually seeing real Prince and Princesses?\" %1$s quietly said to herself as she saw them arrived in a carriage pulled by elegant horses ." +
                        "\n\n%1$s moved towards the banquets piled high with food, cut herself the biggest slice she had ever eaten and poured herself a giant glass of milk." +
                        "\n\n\"Yummy! Wish Mum & Dad were here though, Dad would love this cake!\" said %1$s while rubbing her belly.\n",

                new Choice("Oops, it’s getting late, go back home!", 5),
                //go to page 6
                new Choice("Explore what more the watch can do", 6));
        //go to page 7

        mPages[5] = new Page(
                R.drawable.story1_boy_page6,
                R.drawable.story1_girl_page6,
//page 6
                /*******************
                 * BOY VERSION
                 *******************/
                "As the sun began to set, %1$s wondered how he could get back home. He looked down at the watch and slowly rub it when whoosh... %1$s found himself home again." +
                        "\n\n\"Mum, Dad!\" %1$s called out. \"You wouldn’t believe what just happened! Grandpa's watch is magic! I can time travel with it. It is awesome… you have to see it.\"" +
                        "\n\n%1$s’s Dad looked at him with amazement, told him to slow down and said \"Grandpa’s watch did you say? The one with the green and red lights blinking on it?\"" +
                        "\n\n\"You know about it?\" answered %1$s." +
                        "\n\n\"Oh yes! It was a long time ago… I think I was about your age when your Grandpa invented it. I remember travelling time with it,\" answered Dad. \"And you know what else it can do?\"" +
                        "\n\n\"Tell me Dad please, tell me!\" %1$s pleaded." +
                        "\n\n\"If you shake it, you can take me and your Mum with you on your travel... Do you want that?\" asked Dad.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "As the sun began to set, %1$s wondered how she could get back home. She looked down at the watch and slowly rub it when whoosh... %1$s found herself home again." +
                        "\n\n\"Mum, Dad!\" %1$s called out. \"You wouldn’t believe what just happened! Grandpa's watch is magic! I can time travel with it. It is awesome… you have to see it.\"" +
                        "\n\n%1$s’s Dad looked at her with amazement, told her to slow down and said \"Grandpa’s watch did you say? The one with the green and red lights blinking on it?\"" +
                        "\n\n\"You know about it?\" answered %1$s." +
                        "\n\n\"Oh yes! It was a long time ago… I think I was about your age when your Grandpa invented it. I remember travelling time with it,\" answered Dad. \"And you know what else it can do?\"" +
                        "\n\n\"Tell me Dad please, tell me!\" %1$s pleaded." +
                        "\n\n\"If you shake it, you can take me and your Mum with you on your travel... Do you want that?\" asked Dad.\n",

                new Choice("Travel back in time", 7),
                //go to page 8
                new Choice("Travel forward", 8));
        //go to page 9

        mPages[6] = new Page(
                R.drawable.story1_boy_page7,
                R.drawable.story1_girl_page7,
//page 7
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s decided to take off the watch and explore further. When %1$s flipped the watch and noticed something written on it. The writing said:" +
                        "\n\n\"Press green to travel into the future, press red to travel back in time. Spin the face of the watch to go back to the current time as if nothing ever happened. Shake me to take your loved ones on your journey.\"" +
                        "\n\nThrilled with the idea he can take his parents with him, %1$s hurriedly rotated the face of the watch and whoosh... found himself standing right in front of his parents." +
                        "\n\n\"Mum, Dad! You won’t believe what just happened! I just time travelled! And it’s because of this watch!\" exclaimed %1$s." +
                        "\n\n\"I'm so happy you've discovered it. I used to travel with it when I was young, and now it’s your time to experience the world as it was, and as it will be.\" said Dad." +
                        "\n\n\"And so the three of them excitingly agreed to go on a journey.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s decided to take off the watch and explore further. When %1$s flipped the watch and noticed something written on it. The writing said:" +
                        "\n\n\"Press green to travel into the future, press red to travel back in time. Spin the face of the watch to go back to the current time as if nothing ever happened. Shake me to take your loved ones on your journey.\"" +
                        "\n\nThrilled with the idea she can take her parents with her, %1$s hurriedly rotated the face of the watch and whoosh... found herself standing right in front of her parents." +
                        "\n\n\"Mum, Dad! You won’t believe what just happened! I just time travelled! And it’s because of this watch!\" exclaimed %1$s." +
                        "\n\n\"I'm so happy you've discovered it. I used to travel with it when I was young, and now it’s your time to experience the world as it was, and as it will be.\" said Dad." +
                        "\n\n\"And so the three of them excitingly agreed to go on a journey.\n",

                new Choice("Travel back in time", 7),
                //go to page 8
                new Choice("Travel forward", 8));
        //go to page 9

        mPages[7] = new Page(
                R.drawable.story1_boy_page8,
                R.drawable.story1_girl_page8,
//page 8
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s shook the watch once. Straight away, the three found themselves transported in a room, with an odd looking telephone in the middle, and a few men standing around it." +
                        "\n\nAs they approached closer, they heard one man saying into the old, odd looking thing that seems to be a telephone: \"Mr. Watson, come here. I want to see you.\"" +
                        "\n\n\"Ah! That’s Alexander Graham Bell, the inventor of the telephone! I can’t believe it!\" Mum whispered to %1$s. After that they heard him say: \"The day will come when the man inside the telephone will be able to see the person to whom he is speaking, and what an odd day that will be.\"" +
                        "\n\nMum & Dad laughed and while they jokingly say, \"Wait till we show him our phones!\"" +
                        "\n\n%1$s yawned, beginning to feel tired, he told his parents it was time to go home." +
                        "\n\nBack in their home, happy with his magical watch, %1$s kissed his parents and cheered, \"To our next adventure!\"\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s shook the watch once. Straight away, the three found themselves transported in a room, with an odd looking telephone in the middle, and a few men standing around it." +
                        "\n\nAs they approached closer, they heard one man saying into the old, odd looking thing that seems to be a telephone: \"Mr. Watson, come here. I want to see you.\"" +
                        "\n\n\"Ah! That’s Alexander Graham Bell, the inventor of the telephone! I can’t believe it!\" Mum whispered to %1$s. After that they heard him say: \"The day will come when the man inside the telephone will be able to see the person to whom he is speaking, and what an odd day that will be.\"" +
                        "\n\nMum & Dad laughed and while they jokingly say, \"Wait till we show him our phones!\"" +
                        "\n\n%1$s yawned, beginning to feel tired, she told her parents it was time to go home." +
                        "\n\nBack in their home, happy with her magical watch, %1$s kissed her parents and cheered, \"To our next adventure!\"\n");

        mPages[8] = new Page(
                R.drawable.story1_boy_page9,
                R.drawable.story1_girl_page9,
//page 9
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s shook the watch three times and was instantly transported to a room filled with thousands of virtual books from floor to ceiling." +
                        "\n\nAs they walked around the room, they saw a platform sticking out from beneath the floorboards. %1$s rushed over and jumped on it. A screen popped out and a voice was suddenly loud and present. In a sharp robotic voice, the three adventurers heard:" +
                        "\n\n\"Welcome, please tell us your favorite book topic, so we can begin\"" +
                        "%1$s excitingly shouted \"animals!\"." +
                        "\n\nThe screen in front of them started whizzing, filling with hundreds of animal books all with wonderful pictures on them." +
                        "\n\n\"This is one place I will keep on coming back, for sure!'\" said %1$s." +
                        "\n\nTired from reading, %1$s decided that it was time for their adventure to end. " +
                        "\n\nBack in their home, happy with his magical watch, %1$s kissed his parents and cheered, \"To our next adventure!\n",


                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s shook the watch three times and was instantly transported to a room filled with thousands of virtual books from floor to ceiling." +
                        "\n\nAs they walked around the room, they saw a platform sticking out from beneath the floorboards. %1$s rushed over and jumped on it. A screen popped out and a voice was suddenly loud and present. In a sharp robotic voice, the three adventurers heard:" +
                        "\n\n\"Welcome, please tell us your favorite book topic, so we can begin\"" +
                        "%1$s excitingly shouted \"animals!\"." +
                        "\n\nThe screen in front of them started whizzing, filling with hundreds of animal books all with wonderful pictures on them." +
                        "\n\n\"This is one place I will keep on coming back, for sure!'\", said %1$s." +
                        "\n\nTired from reading, %1$s decided that it was time for their adventure to end. " +
                        "\n\nBack in their home, happy with her magical watch, %1$s kissed her parents and cheered, \"To our next adventure!\n");




    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}
