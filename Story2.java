package com.mylittleadventurer.mylittleadventurer.model;

import com.mylittleadventurer.mylittleadventurer.R;

/**
 * Created by AngelaPinaroc on 15/06/16.
 * THE FENCE OVER THE HILL ADVENTURE STORY
 */
public class Story2 {
    private Page[] mPages;

    public Story2() {

        mPages = new Page[9];

        mPages[0] = new Page(
                R.drawable.story2_boy_page1,
                R.drawable.story2_girl_page1,
//page 1
                /*******************
                 * BOY VERSION
                 *******************/
                "One night %1$s fell asleep and had a dream. In his dream he was in a deep, dark forest. Alone, %1$s felt scared and started crying."+
                        "\n\nWoken up by his loud sobbing, a big, old tree opened its eyes and yawned widely. Looking around, it saw %1$s and wondered what was wrong." +
                        "\n\n\"Why are you crying little one?\" the big, old tree asked %1$s. Realizing that he might have scared him, he quickly said, \"Don’t be afraid, my name is Mr. Graf and I’m here to help and advise you.\"" +
                        "\n\n\"Hello Mr. Graf, my name is %1$s. I’m lost and hungry, can you help me?\" %1$s replied while wiping the tears from his eyes." +
                        "\n\n\"Well of course I can,\" Mr. Graf replied, while pointing his long wooden arm into the distance. \"You see that hill… you just have to climb over it. At the bottom, on the other side, you’ll see a little fence which will lead you straight to your home.\"" +
                        "\n\n%1$s thanked Mr. Graf & gave big hug and went off, in search of the little door. On and on he walked, towards the hill. It was farther than he thought!\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "One night %1$s fell asleep and had a dream. In her dream she was in a deep, dark forest. Alone, %1$s felt scared and started crying."+
                        "\n\nWoken up by her loud sobbing, a big, old tree opened its eyes and yawned widely. Looking around, it saw %1$s and wondered what was wrong." +
                        "\n\n\"Why are you crying little one?\" the big, old tree asked %1$s. Realizing that he might have scared her, he quickly said, \"Don’t be afraid, my name is Mr. Graf and I’m here to help and advise you.\"" +
                        "\n\n\"Hello Mr. Graf, my name is %1$s. I’m lost and hungry, can you help me?\" %1$s replied while wiping the tears from her eyes." +
                        "\n\n\"Well of course I can,\" Mr. Graf replied, while pointing his long wooden arm into the distance. \"You see that hill… you just have to climb over it. At the bottom, on the other side, you’ll see a little fence which will lead you straight to your home.\"" +
                        "\n\n%1$s thanked Mr. Graf & gave big hug and went off, in search of the little door. On and on she walked, towards the hill. It was farther than she thought!\n",

                new Choice("Meet Bravy, the shy squirrel", 1),
                //go to page 2
                new Choice("Meet Cheery, the sad rabbit", 2));
        //go to page 3
        mPages[1] = new Page(
                R.drawable.story2_boy_page2,
                R.drawable.story2_girl_page2,
//page 2
                /*******************
                 * BOY VERSION
                 *******************/
                "As he walked along the muddy path, %1$s saw a brown, fluffy squirrel hiding in some bushes nearby. Crouching down, %1$s called out gently, \"Hey, I can see you….would you like to come out?\"" +
                        "\n\n\"But, but, but… I’m shy.\" the squirrel answered with a soft voice." +
                        "\n\n\"Don’t be, I’m %1$s and I would like you to be my friend.\" %1$s said." +
                        "\n\nHearing this, the squirrel slowly came out and said, \"That's very nice of you. I’m Bravy. I always hide because I’m shy and I don’t know how to make new friends." +
                        "\n\n\"I’ll teach you. It’s easy. You just say, \"Hi! My name is Bravy, what’s yours?\". Finish it with a handshake and a big smile. Like this,\" %1$s said while sticking out his hand and then added. \"Now it’s your turn!\"." +
                        "\n\nBravy took a deep breath and then did exactly what %1$s had done." +
                        "\n\n\"See that wasn’t too hard.\" said %1$s with a big grin." +
                        "\n\n\"No, it wasn’t. Thank you for teaching me that.\" Bravy replied, looking proud. \"And thank you for becoming my first friend.\"" +
                        "\n\n\"I’m happy to help and to be your friend. Sorry, but I need to keep going, I’m trying to find the little door. I hope to see you again!\", %1$s said as he walked off towards the hill.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "As she walked along the muddy path, %1$s saw a brown, fluffy squirrel hiding in some bushes nearby. Crouching down, %1$s called out gently, \"Hey, I can see you….would you like to come out?\"" +
                        "\n\n\"But, but, but… I’m shy.\" the squirrel answered with a soft voice." +
                        "\n\n\"Don’t be, I’m %1$s and I would like you to be my friend.\" %1$s said." +
                        "\n\nHearing this, the squirrel slowly came out and said, \"That's very nice of you. I’m Bravy. I always hide because I’m shy and I don’t know how to make new friends." +
                        "\n\n\"I’ll teach you. It’s easy. You just say, \"Hi! My name is Bravy, what’s yours?\". Finish it with a handshake and a big smile. Like this,\" %1$s said while sticking out her hand and then added. \"Now it’s your turn!\"." +
                        "\n\nBravy took a deep breath and then did exactly what %1$s had done." +
                        "\n\n\"See that wasn’t too hard.\" said %1$s with a big grin." +
                        "\n\n\"No, it wasn’t. Thank you for teaching me that.\" Bravy replied, looking proud. \"And thank you for becoming my first friend.\"" +
                        "\n\n\"I’m happy to help and to be your friend. Sorry, but I need to keep going, I’m trying to find the little door. I hope to see you again!\", %1$s said as she walked off towards the hill.\n",

                new Choice("Help Tamy, the grumpy deer", 3),
                // go to page 4
                new Choice("Help Betty, the impatient caterpillar", 4));
        //go to page 5
        mPages[2] = new Page(
                R.drawable.story2_boy_page3,
                R.drawable.story2_girl_page3,
//page 3
                /*******************
                 * BOY VERSION
                 *******************/
                "As he walked further, %1$s saw a little rabbit, walking in circles with his head down and a sad face, so %1$s decided to find out what was wrong." +
                        "\n\n\"Hi there, my name is %1$s, what’s yours?\" asked %1$s." +
                        "\n\n\"My name is Cheery.\" replied the rabbit in a sad voice." +
                        "\n\n\"You don’t look very cheery… is there a way I can help you?\" %1$s asked gently." +
                        "\n\n\"Well, if you can teach me how to hop, that would help me a lot. All my friends do this and I can’t join them because I don’t know how to do it.\" Cheery answered with an embarrassed voice." +
                        "\n\n\"You are lucky my friend, hopping is one of my favorite things to do at home. Just come and follow me.\" %1$s responded." +
                        "\n\n%1$s hopped back & forth with Cheery eagerly following along. After sometime Cheery became good at it. " +
                        "\n\n\"Look at me! I can’t believe I’m doing it\", Cheery exclaimed. He was so happy, and couldn’t stop saying thanking %1$s." +
                        "\n\n%1$s was so proud of helping Cheery that he decided to teach him something else..." +
                        "\n\n\"Remember to always try to do new things, that’s the only way you’ll know if you can do it or not.\" said %1$s." +
                        "\n\nAnd so, %1$s waved goodbye and continued on his journey.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "As she walked further, %1$s saw a little rabbit, walking in circles with his head down and a sad face, so %1$s decided to find out what was wrong." +
                        "\n\n\"Hi there, my name is %1$s, what’s yours?\" asked %1$s." +
                        "\n\n\"My name is Cheery.\" replied the rabbit in a sad voice." +
                        "\n\n\"You don’t look very cheery… is there a way I can help you?\" %1$s asked gently." +
                        "\n\n\"Well, if you can teach me how to hop, that would help me a lot. All my friends do this and I can’t join them because I don’t know how to do it.\" Cheery answered with an embarrassed voice." +
                        "\n\n\"You are lucky my friend, hopping is one of my favorite things to do at home. Just come and follow me.\" %1$s responded." +
                        "\n\n%1$s hopped back & forth with Cheery eagerly following along. After sometime Cheery became good at it. " +
                        "\n\n\"Look at me! I can’t believe I’m doing it\", Cheery exclaimed. He was so happy, and couldn’t stop saying thanking %1$s." +
                        "\n\n%1$s was so proud of helping Cheery that she decided to teach him something else..." +
                        "\n\n\"Remember to always try to do new things, that’s the only way you’ll know if you can do it or not.\" said %1$s." +
                        "\n\nAnd so, %1$s waved goodbye and continued on her journey.\n",

                new Choice("Help Tamy, the grumpy deer", 3),
                // go to page 4
                new Choice("Help Betty, the impatient caterpillar", 4));

        mPages[3] = new Page(
                R.drawable.story2_boy_page4,
                R.drawable.story2_girl_page4,
//page 4
                /*******************
                 * BOY VERSION
                 *******************/
                "As %1$s was passing the side of a river, he heard a loud stomping. Curious as ever, he decided to approach it." +
                        "\n\n\"Excuse me sir, but may I ask why are you angry?\" asked %1$s." +
                        "\n\n\"I’m grumpy because I’m frustrated and I can’t do the things I need to do.\" said the angry deer." +
                        "\n\n\"Maybe yu can try what my mum taught me to do when I feel grouchy. Its very simple you, first you take a deep breath and then count all the way to ten?\" suggested %1$s." +
                        "\n\nDesperate, the angry deer decided to try. So he closed his eyes, and counted one to ten." +
                        "\n\n\"Are you feeling better?\" %1$s asked gently." +
                        "\n\n\"Oh yes. I’m feeling more relaxed now actually. It’s like my grumpiness just magically disappeared. Now I can think clearly of all the things I need to do.\" replied the deer." +
                        "\n\n\"That’s great. Now, every time you’re feeling angry, do what we just did and you can fix anything.\" said %1$s." +
                        "\n\n\"Thank you very much. But wait, I didn’t even get your name. My name is Tamy by the way.\"" +
                        "\n\n\"Oh! I forgot to introduce myself. I’m %1$s. I’m very glad to help! But I must go and cross the hill.\" replied %1$s." +
                        "\n\n%1$s finally crossed the hill. But, when he got to the end, he was caught by surprise. There was not one, but two doors in front of him!\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "As %1$s was passing the side of a river, she heard a loud stomping. Curious as ever, she decided to approach it." +
                        "\n\n\"Excuse me sir, but may I ask why are you angry?\" asked %1$s." +
                        "\n\n\"I’m grumpy because I’m frustrated and I can’t do the things I need to do.\" said the angry deer." +
                        "\n\n\"Maybe yu can try what my mum taught me to do when I feel grouchy. Its very simple you, first you take a deep breath and then count all the way to ten?\" suggested %1$s." +
                        "\n\nDesperate, the angry deer decided to try. So he closed his eyes, and counted one to ten." +
                        "\n\n\"Are you feeling better?\" %1$s asked gently." +
                        "\n\n\"Oh yes. I’m feeling more relaxed now actually. It’s like my grumpiness just magically disappeared. Now I can think clearly of all the things I need to do.\" replied the deer." +
                        "\n\n\"That’s great. Now, every time you’re feeling angry, do what we just did and you can fix anything.\" said %1$s." +
                        "\n\n\"Thank you very much. But wait, I didn’t even get your name. My name is Tamy by the way.\"" +
                        "\n\n\"Oh! I forgot to introduce myself. I’m %1$s. I’m very glad to help! But I must go and cross the hill.\" replied %1$s." +
                        "\n\n%1$s finally crossed the hill. But, when she got to the end, she was caught by surprise. There was not one, but two doors in front of her!\n",


                new Choice("Choose the Red Wooden Door", 5),
                new Choice("Choose the Blue Wooden Door", 6));
        //go to page 5

        mPages[4] = new Page(
                R.drawable.story2_boy_page5,
                R.drawable.story2_girl_page5,
//page 5
                /*******************
                 * BOY VERSION
                 *******************/
                "As %1$s was passing the side of a river, he heard a small voice calling out." +
                        "\n\n\"Psst…No not there, over there! I’m here, hanging by the tree. Come closer.\" said the fat caterpillar who was trying to wiggle out of her cocoon." +
                        "\n\n\"Ah there you are! I’m %1$s. I just stopped by to ask if I can help you.\" asked %1$s." +
                        "\n\n\"Hi %1$s, I’m Betty. All my sisters have already turned into beautiful butterflies and I’m still stuck here. I’m so bored, I want to be a butterfly already!\", grumbled Betty. \"I have an idea, why don’t you help me get out of this by pulling me out!\"" +
                        "\n\n\"Oh no Betty. I can’t do that. My teacher told me that it is important for caterpillars to wait for their wings to grow while they are inside their cocoon. If I take you out now, your wings might not be ready, and you’ll stay a caterpillar forever. You wouldn’t like that, would you?\" %1$s quickly replied." +
                        "\n\n\"You mean, if I don’t wait like my sisters did, I won’t have wings? Whew! Good thing you told me, I guess I should wait… It’s kind of warm and cozy inside here...\", Betty said with a smile while closing her eyes as if she was being snuggled by a soft pillow." +
                        "\n\nAs soon as %1$s took a step back, the cocoon fell off, and out came the prettiest butterfly he had ever seen." +
                        "\n\n\"Look at me %1$s! I’m a beautiful butterfly. Thank you so much for telling me to wait! I love my wings! Weeee!!\" shouted Betty with great joy." +
                        "\n\nThose wings are beautiful Betty. Go enjoy, and play with your sisters. I have to go and cross that hill to go home.\" replied %1$s." +
                        "\n\n%1$s finally crossed the hill. But, when he got to the end, he was caught by surprise. There was not one, but two doors in front of him!\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "As %1$s was passing the side of a river, she heard a small voice calling out." +
                        "\n\n\"Psst…No not there, over there! I’m here, hanging by the tree. Come closer.\" said the fat caterpillar who was trying to wiggle out of her cocoon." +
                        "\n\n\"Ah there you are! I’m %1$s. I just stopped by to ask if I can help you.\" asked %1$s." +
                        "\n\n\"Hi %1$s, I’m Betty. All my sisters have already turned into beautiful butterflies and I’m still stuck here. I’m so bored, I want to be a butterfly already!\", grumbled Betty. \"I have an idea, why don’t you help me get out of this by pulling me out!\"" +
                        "\n\n\"Oh no Betty. I can’t do that. My teacher told me that it is important for caterpillars to wait for their wings to grow while they are inside their cocoon. If I take you out now, your wings might not be ready, and you’ll stay a caterpillar forever. You wouldn’t like that, would you?\" %1$s quickly replied." +
                        "\n\n\"You mean, if I don’t wait like my sisters did, I won’t have wings? Whew! Good thing you told me, I guess I should wait… It’s kind of warm and cozy inside here...\", Betty said with a smile while closing her eyes as if she was being snuggled by a soft pillow." +
                        "\n\nAs soon as %1$s took a step back, the cocoon fell off, and out came the prettiest butterfly she had ever seen." +
                        "\n\n\"Look at me %1$s! I’m a beautiful butterfly. Thank you so much for telling me to wait! I love my wings! Weeee!!\" shouted Betty with great joy." +
                        "\n\nThose wings are beautiful Betty. Go enjoy, and play with your sisters. I have to go and cross that hill to go home.\" replied %1$s." +
                        "\n\n%1$s finally crossed the hill. But, when she got to the end, she was caught by surprise. There was not one, but two doors in front of her!\n",

                new Choice("Choose the Red Wooden Door", 5),
                new Choice("Choose the Blue Wooden Door", 6));
        //go to page 6

        mPages[5] = new Page(
                R.drawable.story2_boy_page6,
                R.drawable.story2_girl_page6,
//page 6
                /*******************
                 * BOY VERSION
                 *******************/
                "\"Hmmm… Which door should I choose… I know, red! Red is mum’s favorite color.\" said %1$s to himself." +
                        "\n\nAs %1$s approached the red door, a note magically appeared in front of him. Written on it was: " +
                        "\n\n\"If you decide to come back and give a helping hand, in your dream just knock on your door three times and you’ll be back to meet new friends.\"" +
                        "\n\n\"I can come back anytime? That’s wonderful.\" %1$s shouted out of joy. And with this in mind, he happily opened the door, noticing a familiar room in front of him." +
                        "\n\n\"Yey! I’m back home again!\" exclaimed %1$s. " +
                        "\n\nIt was already very late so he quickly jumped into his bed and grabbed his favorite teddy bear. " +
                        "\n\n\"I am so happy Teddy, today I helped so many friends! I want to do it all again,\" %1$s said, chatting quickly to his teddy. \"Don’t worry, next time I’ll bring you with me.\"" +
                        "\n\nHe snuggled down into the covers, but %1$s couldn’t sleep. He was still too excited about the adventure he just had. So he decided to do one last thing before the night was finished.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "\"Hmmm… Which door should I choose… I know, red! Red is mum’s favorite color.\" said %1$s to herself." +
                        "\n\nAs %1$s approached the red door, a note magically appeared in front of her. Written on it was: " +
                        "\n\n\"If you decide to come back and give a helping hand, in your dream just knock on your door three times and you’ll be back to meet new friends.\"" +
                        "\n\n\"I can come back anytime? That’s wonderful.\" %1$s shouted out of joy. And with this in mind, she happily opened the door, noticing a familiar room in front of her." +
                        "\n\n\"Yey! I’m back home again!\" exclaimed %1$s. " +
                        "\n\nIt was already very late so she quickly jumped into her bed and grabbed her favorite teddy bear. " +
                        "\n\n\"I am so happy Teddy, today I helped so many friends! I want to do it all again,\" %1$s said, chatting quickly to her teddy. \"Don’t worry, next time I’ll bring you with me.\"" +
                        "\n\nShe snuggled down into the covers, but %1$s couldn’t sleep. She was still too excited about the adventure she jsut had. So she decided to do one last thing before the night was finished.\n",

                new Choice("Write your adventure in your diary",7),
                new Choice("Tell Mom & Dad your adventure", 8));
        //go to page 7

        mPages[6] = new Page(
                R.drawable.story2_boy_page7,
                R.drawable.story2_girl_page7,
//page 7
                /*******************
                 * BOY VERSION
                 *******************/
                "\"But which door should I choose, hmm, I’ll try the blue one. It’s Dad’s favorite color.” said %1$s to himself. " +
                        "\n\nAs %1$s approached the blue door, a small, white note appeared on it. It said:" +
                        "\n\n\"If you decide to come back and give a helping hand, in your dreams, just knock on your door three times and you’ll be back to meet new friends.\"" +
                        "\n\n\"What? I can come back anytime! That’s wonderful.\" %1$s shouted with joy. " +
                        "\n\nAnd with this in mind, he happily opened the door. As he stepped through the small, wooden door, %1$s saw his bed in the corner as normal, and his desk by the door. It was his room!" +
                        "\n\n\"Hooray! I’m back  in my room again!\" exclaimed %1$s." +
                        "\n\nHe quietly walk towards his bed, careful not to wake his parents, grabbing his favorite teddy bear for a giant hug." +
                        "\n\n\"I missed you Teddy, it was an amazing adventure and next time I’ll take you with me, I promise.\", %1$s whispered to his teddy. " +
                        "\n\n%1$s was still too excited about the experience he just had that he decided to do one last thing before finishing the night.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "\"But which door should I choose, hmm, I’ll try the blue one. It’s Dad’s favorite color.” said %1$s to herself. " +
                        "\n\nAs %1$s approached the blue door, a small, white note appeared on it. It said:" +
                        "\n\n\"If you decide to come back and give a helping hand, in your dreams, just knock on your door three times and you’ll be back to meet new friends.\"" +
                        "\n\n\"What? I can come back anytime! That’s wonderful.\" %1$s shouted with joy. " +
                        "\n\nAnd with this in mind, she happily opened the door. As she stepped through the small, wooden door, %1$s saw her bed in the corner as normal, and her desk by the door. It was her room!" +
                        "\n\n\"Hooray! I’m back in my room again!\" exclaimed %1$s." +
                        "\n\nShe quietly walk towards her bed, careful not to wake her parents, grabbing her favorite teddy bear for a giant hug." +
                        "\n\n\"I missed you Teddy, it was an amazing adventure and next time I’ll take you with me, I promise.\", %1$s whispered to her teddy. " +
                        "\n\n%1$s was still too excited about the experience she just had that she decided to do one last thing before finishing the night.\n",

                new Choice("Write your adventure in your diary",7),
                new Choice("Tell Mom & Dad your adventure", 8));
        //go to page 7


        mPages[7] = new Page(
                R.drawable.story2_boy_page8,
                R.drawable.story2_girl_page8,
//page 8
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s stood up from his bed and crept quietly to his desk. He opened the top drawer and took out a diary that his grandfather had given him. He remembered that his grandfather told him to write wonderful experiences in his diary so that he could always remember them and the lessons he had been taught. " +
                        "\n\n\"I should write down all those experiences I had and all the names of the friends I met.\" %1$s thought. " +
                        "\n\nHe quickly wrote down all the names of the animal friends he had gained, and the lessons he had taught them. He also added what other animals he would like to meet next time in the forest. After writing, he closed his diary and put it back in his drawer." +
                        "\n\n\"Now I’m ready to sleep.\" said %1$s to himself with a smile." +
                        "\n\nFrom then on, %1$s was always excited to go to bed, knowing that he would meet new friends and have new adventures.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s stood up from her bed and crept quietly to her desk. She opened the top drawer and took out a diary that her grandfather had given her. She remembered that her grandfather told her to write wonderful experiences in her diary so that she could always remember them and the lessons she had been taught. " +
                        "\n\n\"I should write down all those experiences I had and all the names of the friends I met.\" %1$s thought. " +
                        "\n\nShe quickly wrote down all the names of the animal friends she had gained, and the lessons she had taught them. She also added what other animals she would like to meet next time in the forest. After writing, she closed her diary and put it back in her drawer." +
                        "\n\n\"Now I’m ready to sleep.\" said %1$s to herself with a smile." +
                        "\n\nFrom then on, %1$s was always excited to go to bed, knowing that she would meet new friends and have new adventures.\n");


        mPages[8] = new Page(
                R.drawable.story2_boy_page9,
                R.drawable.story2_girl_page9,
//page 9
                /*******************
                 * BOY VERSION
                 *******************/
                "%1$s stood up from his bed and crept to his parents’ room. He gently knocked on their door and called out." +
                        "\n\n\"Mum, Dad are you still awake? May I come in? I have an amazing story to tell you!\" %1$s whispered." +
                        "\n\n\"Of course my love. Come in %1$s.\" Mum answered." +
                        "\n\n%1$s opened the door, and hopped onto the end of his parents’ bed." +
                        "\n\n\"I had a dream where I met different animal friends and I helped them on my way to the doors.\" %1$s narrated excitingly." +
                        "\n\n\"That’s great %1$s. How did it feel helping others?\" Dad asked. " +
                        "\n\n\"It was great Dad. The good news is I can go back to the forest anytime.\" %1$s answered. " +
                        "\n\nAfter telling his parents the story, %1$s kissed and hugged them goodnight." +
                        "\n\nFrom then on, %1$s was always excited to go to bed knowing that he could meet new friends and have new adventures.\n",

                /*******************
                 * GIRL VERSION
                 *******************/
                "%1$s stood up from her bed and crept to her parents’ room. She gently knocked on their door and called out." +
                        "\n\n\"Mum, Dad are you still awake? May I come in? I have an amazing story to tell you!\" %1$s whispered." +
                        "\n\n\"Of course my love. Come in %1$s.\" Mum answered." +
                        "\n\n%1$s opened the door, and hopped onto the end of her parents’ bed." +
                        "\n\n\"I had a dream where I met different animal friends and I helped them on my way to the doors.\" %1$s narrated excitingly." +
                        "\n\n\"That’s great %1$s. How did it feel helping others?\" Dad asked. " +
                        "\n\n\"It was great Dad. The good news is I can go back to the forest anytime.\" %1$s answered. " +
                        "\n\nAfter telling her parents the story, %1$s kissed and hugged them goodnight." +
                        "\n\nFrom then on, %1$s was always excited to go to bed knowing that she could meet new friends and have new adventures.\n");

    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}
