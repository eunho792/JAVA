import time
import operator

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

rating_data = pd.io.parsers.read_csv('data/ml-1m/ratings.dat', names=['user_id','movie_id','rating','time'], delimiter="::")



